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
@Path("espaceClient")
@View("espaceClient.jsp")

public class EspaceClientController {
   @Inject
   SessionClient client;
   @Inject
   Models models;
   @Inject
   ClientFacade facade;
   private String codeClient;
   public void bienvenue(){
        codeClient = client.getcode();
        Client c = facade.find(codeClient);
        models.put("client", c);
        models.put("client",client);
   }
}
