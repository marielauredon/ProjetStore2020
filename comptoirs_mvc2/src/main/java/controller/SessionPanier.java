/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.entity.Produit;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marie
 */
@SessionScoped
@Named("panier")
   
public class SessionPanier implements Serializable {

    private ArrayList contenu;
    
    public void addProduct (ArrayList ProduitQte){
        contenu.add(ProduitQte);
    }
    
    public void removeProduct(Integer i){
       contenu.remove(i);
    }
    
    
    public ArrayList getPanier(){
        return contenu;
    }
    
}

