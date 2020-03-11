 package service;

import comptoirs.model.dao.CategorieFacade;
import java.util.List;
import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import comptoirs.model.entity.Categorie;


@Path("service/allCategories")
public class AllCategoriesService {
	@Inject
	CategorieFacade facade;
	
	/**
	 * La sérialisation en JSON ne marche pas, pourquoi ?
	 * Celui qui trouve la solution à 2 points de plus.
	 * @return Toutes les catégories (en XML seulement pour le moment !)
         * 
	 *///car il faut faire appel à AJAX fonction jquery pour convertir en XML et JSON
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Categorie> allCategories() {
		List<Categorie> result = facade.findAll();
		return result;
	}
}
