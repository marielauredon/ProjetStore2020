/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.entity.Categorie;
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
@Path("administrateur")
@View("administrateur.jsp")
public class AdminController {
  @Inject 
  CategorieFacade facade;
  @Inject
  Models models; // Pour transmettre les infos à la vue
  @GET
  public void afficheNbProduitsCommandés(
    @QueryParam("code") int codeCategorie ) {
      Categorie cg = facade.find(codeCategorie);
      models.put("categorie", cg);
  }
}
