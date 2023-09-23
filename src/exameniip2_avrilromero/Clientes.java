/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Valeria Romero
 */
public class Clientes extends Usuarios implements Serializable{
     private static final long serialVersionUID =  777L;    
    private ArrayList<Canciones> favoritas = new ArrayList();
    private ArrayList<Listas> listas_reproduccion = new ArrayList();
    private ArrayList<Listas> megusta = new ArrayList();
    public Clientes() {
    }

    public Clientes(String username, String password, int edad) {
        super(username, password, edad);
    }

    public ArrayList<Canciones> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Canciones> favoritas) {
        this.favoritas = favoritas;
    }

    public ArrayList<Listas> getListas_reproduccion() {
        return listas_reproduccion;
    }

    public void setListas_reproduccion(ArrayList<Listas> listas_reproduccion) {
        this.listas_reproduccion = listas_reproduccion;
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
    public void addMegusta(Listas e){
        megusta.add(e);
    }
    public void addFav(Canciones e){
        favoritas.add(e);
    }

    @Override
    public String toString() {
        return  username;
    }
   
    
    
    
}
