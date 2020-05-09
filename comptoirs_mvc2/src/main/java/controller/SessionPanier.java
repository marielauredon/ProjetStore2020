/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.entity.Ligne;
import comptoirs.model.entity.Produit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marie
 */
@SessionScoped
@Named("panier")
   
public class SessionPanier implements Serializable {
    
    private Integer numero;
    private Collection<Ligne> ligneCollection;
    
    public void setNumero(Integer numero){
        this.numero=numero;
    }
    
    public Integer getNumero(){
        return numero;
    }
    
    public void addProduct (Ligne ligne){
        ligneCollection.add(ligne);
    }
    
    public void removeProduct(Integer i){
       ligneCollection.remove(i);
    }
    
    
    public Collection getPanier(){
        return ligneCollection;
    }
    
}

