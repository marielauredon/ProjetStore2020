package comptoirs.model.dao;

import comptoirs.model.dto.StatsResult;
import controller.SessionClient;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class StatisticsDao {
	private static final String UNITS_SOLD = 
		"SELECT cat.libelle, SUM(li.quantite) " +
		"FROM Categorie cat " + 
		"JOIN cat.produitCollection p " + 
		"JOIN p.ligneCollection li " + 
		"GROUP BY cat.libelle";
	
	private static final String UNIT_SOLDS_DTO =
		"SELECT new comptoirs.model.dto.StatsResult" +
				        "(cat.libelle, SUM(li.quantite)) " + 
		"FROM Categorie cat " + 
		"JOIN cat.produitCollection p " + 
		"JOIN p.ligneCollection li " + 
		"GROUP BY cat.libelle";
	
	private static final String PRODUCTS_SOLDS_DTO =
		"SELECT new comptoirs.model.dto.StatsResult" +
				        "(p.nom, SUM(li.quantite)) " + 
		"FROM Produit p " +
		"JOIN p.categorie cat " +
		"JOIN p.ligneCollection li " + 
		"WHERE cat.code = :code " +
		"GROUP BY p.nom " ;
        
        private static final String PURCHASE_ORDER =
                "SELECT new comptoirs.model.dto.StatsResult" +
                                        "(c.client, li.quantité) " +
                "FROM Ligne li " +
                "JOIN Commande com " +
                "JOIN Produit p " +
                "WHERE com.client = :code AND com.numero=li.commande" ;
                
            
	
	@PersistenceContext(unitName = "comptoirs")
	private EntityManager em;

	public List unitesVenduesParCategorie() {
		Query query = em.createQuery(UNITS_SOLD);
		List results = query.getResultList();
		return results;
	}

	public List<StatsResult> unitesVenduesParCategorieDTO() {
		Query query = em.createQuery(UNIT_SOLDS_DTO, StatsResult.class);
		List<StatsResult> results = query.getResultList();
		return results;
	}		
	
	public List<StatsResult> produitsVendusPour(Integer codeCategorie) {
		Query query = em.createQuery(PRODUCTS_SOLDS_DTO, StatsResult.class);
		List<StatsResult> results = query.setParameter("code", codeCategorie).getResultList();
		return results;
	}
	
        @Inject
        SessionClient client;
        public List<StatsResult> bondecommande(){
            Query query = em.createQuery(PURCHASE_ORDER, StatsResult.class);
            String codeClient=client.getcode();
            List<StatsResult> results = query.setParameter("code", codeClient).getResultList();
            return results;
        }
}
