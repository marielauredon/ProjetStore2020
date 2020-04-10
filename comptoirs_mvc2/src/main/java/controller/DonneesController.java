/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import form.ClientForm;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.BeanParam;
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
@Path("mesdonnees")
@View("mesdonnees.jsp")

public class DonneesController {

    @Inject
    ClientFacade facade;
    @Inject
    Models models;
    String codeClient;
    @Inject
    SessionClient client;

    @GET  
    public void AfficheClient() {
        codeClient = client.getcode();
        Client c = facade.find(codeClient);
        models.put("leclient", c);
    }
    
    @POST
    public String changer(@BeanParam ClientForm dataClient) {
        Client c = facade.find(dataClient.getCode());
        c.setContact(dataClient.getContact());
        c.setSociete(dataClient.getSociete());
        c.setFonction(dataClient.getFonction());
        c.setAdresse(dataClient.getAdresse());
        c.setVille(dataClient.getVille());
        c.setRegion(dataClient.getRegion());
        c.setCodePostal(dataClient.getCodePostal());
        c.setPays(dataClient.getPays());
        c.setTelephone(dataClient.getTelephone());
        c.setFax(dataClient.getFax());
        facade.edit(c);  
	// Et maintenant, on va où ?
	// Par défaut, on retourne sur mesdonnées.jsp
        models.put("leclient", c);
        return "mesdonnees.jsp";
    }
    
   
}
