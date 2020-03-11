/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
/**
 *
 * @author marie
 */
    
@SessionScoped
@Named("admin")
public class SessionAdmin implements Serializable{
    private String code;
    private String nom;    
public void setCode(){
    code="admin";
    nom="admin";
}

public String getCode(){
    return code;
}

public String getNom(){
    return nom;
}
}
