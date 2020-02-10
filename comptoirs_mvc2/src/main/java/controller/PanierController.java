/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Produit;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;


/**
 *
 * @author marie
 */
@SessionScoped
@Named("panier")

public class PanierInfo {
    @Inject 
    ProduitFacade facade; 
    @Inject
    Models Models;
    @GET
    public void AjoutProduitCommande(@QueryParam('REFERENCE') int referenceProduit){
    
}       
            
            
    
            
ArrayList<Produit> ListProduits;

    public PanierController() {
        this.ListProduits = new ArrayList();
    }

    public void AjoutProduit(Produit MonProduit) {
        ListProduits.add(MonProduit);
    }
    public void SuppProduit(ArrayList<Produit> ListProduits, int i) {
        Produit LeProduit = ListProduits.get(i);
        ListProduits.remove(LeProduit);
    }

    public void CaddieSupermarché(ArrayList<Produit> ListProduits) {
        System.out.print(Produit.nom + Produit.reference + Produit.prixUnitaire);
    }

}
