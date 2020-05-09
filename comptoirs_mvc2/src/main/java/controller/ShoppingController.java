/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.dao.ClientFacade;
import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Categorie;
import comptoirs.model.entity.Client;
import comptoirs.model.entity.Ligne;
import comptoirs.model.entity.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author marie
 */
@Controller
@Path("shopping")
@View("shopping.jsp")
public class ShoppingController {
    @Inject
    ClientFacade facadec;
    
    @Inject
    ProduitFacade facadep;
    
    @Inject
    Models models;
    
    @Inject
    SessionClient client;
    
    @Inject
    SessionPanier panier;
    
    String codeClient;
    
    @Inject
    CategorieFacade facade;
    
    Ligne ligne;
    
    
    @GET
	public void produitsParCategorie( @QueryParam("code") Integer codeCategorie) {
		// On cherche la liste des catégories pour l'afficher dans la liste de choix
		final List<Categorie> touteslesCategories = facade.findAll();

		// On cherche la catégorie à partir de son code passé en paramètre
		Categorie categorieChoisie;
		if (codeCategorie != null) // Est-ce qu'on a un paramètre ?
			// On va chercher la catégorie 
			categorieChoisie = facade.find(codeCategorie); // Et si on ne trouve pas ?
		else
			// On prend la première de la liste (encore faut-il qu'il y en ait une !)
			categorieChoisie = touteslesCategories.get(0);              

		// On transmet les informations à la vue
		models.put("categories", touteslesCategories);
		models.put("selected", categorieChoisie);
                
	}
    
   @POST
   public void AfficherPanier(@QueryParam("produit") Produit produit, @FormParam("quantite") short quantite){
       ligne.setProduit1(produit);
       ligne.setQuantite(quantite);
       panier.addProduct(ligne);
   }
}