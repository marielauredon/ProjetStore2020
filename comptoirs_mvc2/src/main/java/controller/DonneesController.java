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

    @GET
    public void AfficheClient(@QueryParam("code") String codeClient) {
        Client c = facade.find(codeClient);
        models.put("client", c);
    }

    @POST
    public void changerContact(@QueryParam("code") String referenceClient, @QueryParam("contact") String contact) {

        Client c = facade.find(referenceClient);
        c.setContact(contact);
        facade.edit(c);
        models.put("client", c);

    }

}
