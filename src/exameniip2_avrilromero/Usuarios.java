/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Usuarios implements Serializable{
    private static final long serialVersionUID =  777L;
    protected String username;
   
    protected String password;
    protected int edad;

    public Usuarios() {
    }

    public Usuarios(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return username;
    }

}
