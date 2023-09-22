/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Valeria Romero
 */
public class Singles extends Lanzamientos implements Serializable{
    private static final long serialVersionUID =  777L;
    private Canciones cancion;

    public Singles() {
    }

    public Singles( String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
       
    }

    public Canciones getCancion() {
        return cancion;
    }

    public void setCancion(Canciones cancion) {
        this.cancion = cancion;
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
        return  titulo;
    }
    
    
}
