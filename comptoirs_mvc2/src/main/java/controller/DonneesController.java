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
    public void AfficheClient(@QueryParam("code")String codeClient){
        Client c = facade.find(codeClient);
        models.put("client",c);
    }
    public void changerContact(@QueryParam("contact") String referenceClient, String contact){
        
        Client c = facade.find(referenceClient);
        c.setContact(contact);
        facade.edit(c);
    }
    public void changerAdresse(@QueryParam("adresse") String referenceClient, String adresse ){
        
        Client c = facade.find(referenceClient);
        c.setAdresse(adresse);
        facade.edit(c);
    }
    public void changerFonction(@QueryParam("fonction") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(fonction);
        facade.edit(c);
        
    public void changerVille(@QueryParam("ville") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(ville);
        facade.edit(c);
        
    public void changerFonction(@QueryParam("region") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(region);
        facade.edit(c);
        
    public void changerFonction(@QueryParam("region") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(region);
        facade.edit(c);
        
    public void changerFonction(@QueryParam("code   postale") String referenceClient, String fonction){
        
        Client c = facade.find(referenceClient);
        c.setFonction(code postale);
        facade.edit(c);
    }
   // Faire Changer Ville,région, code postale, pays, téléphone, faxe
    
    
}
