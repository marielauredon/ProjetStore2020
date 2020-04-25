/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import comptoirs.model.entity.Commande;
import java.util.Collection;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author marie
 */
@Controller
@Path("bondecommande")
@View("bondecommande.jsp")
public class BonDeCommandeController {
    
    @Inject
    ClientFacade facadec;
    
    @Inject
    Models models;
    
    @Inject
    SessionClient client;
    
    String codeClient;
    
    Collection<Commande> LesCommandes;
    
@GET
public void AfficheBonDeCommande(){
    codeClient = client.getcode();
    Client c = facadec.find(codeClient);
    LesCommandes = c.getCommandeCollection();
    models.put("bondecommande",LesCommandes);
}
   
}
