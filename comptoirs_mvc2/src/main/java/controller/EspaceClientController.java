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


public class EspaceClientController {
   @Inject
   Models models;
   @Inject
   ClientFacade facadeC;
   @Inject
   SessionClient client;
   private String codeClient;
   
   @GET
   @View("espaceClient.jsp")
   public void bienvenue(){
        Client c = facadeC.find(client.getcode());
        models.put("leclient",c);
   }
}
