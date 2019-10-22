package org.jboss.as.quickstarts.jboss.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.as.quickstarts.jboss.domain.Users;



import org.jboss.as.quickstarts.jboss.domain.UserDao;

@Named
@RequestScoped
public class UserController {

	
	@Inject
    private UserDao userDao;
	
	//private int id;
	private String nombre;    
	private String password;
	private String email;
	private String sexo;
	private String pais;
	
	public void crearUsuario() {
        //Users user = userDao.crearUsuario(nombre,password,email,sexo,pais);
        /*if (user != null) {
            greeting = "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
        } else {
            greeting = "No such user exists! Use 'emuster' or 'jdoe'";
        }*/
    }
	
	ArrayList<Users> user ;
	public  Users listarUsuario() {
        Users user = userDao.listarUsuario();
        if (user != null) {
            System.out.println("entra");
            this.nombre = user.getNombre();
            this.password = user.getPassword();
            this.email = user.getEmail();
            this.sexo = user.getSexo();
            this.pais = user.getPais();
        } else {
        	System.out.println("NO entra");
        }
        return user;
    }
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
