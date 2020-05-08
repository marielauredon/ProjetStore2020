/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import javax.mvc.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author marie
 */
@Controller
@Path("détailsCommande")
@View("détailsCommande.jsp")
public class DétailsCommandeController {
    @Inject
    ClientFacade facadec;

    
    @Inject
    Models models;
    
    @Inject
    SessionClient client;
    
    String codeClient;
    
    @GET  
    public void showclient() {
        codeClient = client.getcode();
        Client c = facadec.find(codeClient);
        models.put("leclient", c);
    }
    
}
