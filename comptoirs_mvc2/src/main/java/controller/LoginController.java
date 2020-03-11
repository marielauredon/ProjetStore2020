package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import form.ClientForm;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.math.BigDecimal;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Controller
@Path("login")
@View("login.jsp")
public class LoginController {

    @Inject
    ClientFacade dao;

    @Inject
    BindingResult formValidationErrors;

    @Inject
    Models models;
    
    @Inject
    SessionClient client;
   


    @GET
    public void show() {
        models.put("login", dao.findAll());
    }

    @POST
    @Path("login")
    public String login(@FormParam("nom") String nom, @FormParam("code") String code) {
            try {
                
                Client c = dao.find(code);
                client.setCode(code);
                if (c.getContact().equals(nom)) {
                    return "redirect:espaceClient";
                }
            } catch (Exception e) {
                models.put("databaseErrorMessage", "Mot de passe ou login incorrect");
            }
       // }
       //models.put("validationErrors", formValidationErrors);
        return null;
    }
}
