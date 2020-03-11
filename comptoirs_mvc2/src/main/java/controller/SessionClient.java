/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mvc.Models;
import javax.ws.rs.QueryParam;


/**
 *
 * @author marie
 */
@SessionScoped
@Named("client")
   
public class SessionClient implements Serializable {
    @Inject
    ClientFacade facade;
    @Inject
    Models models;
    private String codeClient;
        
    public String setCode(@QueryParam("code") String codeClient){
        try{
            Client c = facade.find(codeClient);
            this.codeClient=codeClient;
            
        }catch(Exception e){models.put("databaseErrorMessage","Client introuvable");}  
        
        return null;
    }
    
    public String getcode(){
        return codeClient;
    }
    
}
