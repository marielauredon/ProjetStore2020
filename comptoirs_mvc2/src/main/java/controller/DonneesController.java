/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author marie
 */
@Controller
@Path("mesdonnees")
@View("mesdonnees.jsp")
public class DonneesController {
    @Inject
    ClientFacade facade;
    @Inject 
    Models models;  
    @GET
    public void changerContact(@QueryParam("reference") String referenceClient, String contact){
        
        Client c = facade.find(referenceClient);
        c.setContact(contact);
        facade.edit(c);
    }
    public void changerAdresse(@QueryParam("reference") String referenceClient, String adresse ){
        
        Client c = facade.find(referenceClient);
        c.setAdresse(adresse);
        facade.edit(c);
    }
    public void changerFonction(@QueryParam("reference") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(fonction);
        facade.edit(c);

    }
    //Faire Changer Ville,région, code postale, pays, téléphone, faxe
    
    
}
