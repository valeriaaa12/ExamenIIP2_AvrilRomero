/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Valeria Romero
 */
public class Album extends Lanzamientos {

    private ArrayList<Canciones> canciones = new ArrayList();
    private int cant_canciones;

    public Album() {
    }

    public Album(int cant_canciones, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);

        this.cant_canciones = cant_canciones;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public void agregarCancion(Canciones a) {
        canciones.add(a);
    }

    public int getCant_canciones() {
        return cant_canciones;
    }

    public void setCant_canciones(int cant_canciones) {
        this.cant_canciones = cant_canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
