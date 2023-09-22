/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Listas {
    private String nombre;
    private int likes;
    private ArrayList<Canciones> canciones;

    public Listas(String nombre, int likes, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.likes = likes;
        this.canciones = canciones;
    }

    public Listas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
    public void addSong(Canciones e){
        canciones.add(e);
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
