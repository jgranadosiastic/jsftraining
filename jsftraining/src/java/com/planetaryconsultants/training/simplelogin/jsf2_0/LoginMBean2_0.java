/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.planetaryconsultants.training.simplelogin.jsf2_0;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * ClassRoom
 * @author jgranados - 13.03.2014 
 * @Title: LoginMBean2_0
 * @Description: description
 *
 * Changes History
 */
@ManagedBean
@RequestScoped
public class LoginMBean2_0 {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
