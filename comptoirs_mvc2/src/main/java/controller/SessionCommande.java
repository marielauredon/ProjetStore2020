/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marie
 */
@SessionScoped
@Named("commande")
public class SessionCommande implements Serializable{
     Integer numero;
    
         public void setNumero(Integer code){
            this.numero=code;
    }
    public Integer getNumero(){
        return numero;
    }
    
    
}
