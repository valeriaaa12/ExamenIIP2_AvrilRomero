/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

import java.io.Serializable;

/**
 *
 * @author Valeria Romero
 */
public class Canciones implements Serializable{
    private static final long serialVersionUID =  777L;
    private String titulo;
    private double duracion;
    private Lanzamientos referencia;

    public Canciones() {
    }

    public Canciones(String titulo, double duracion, Lanzamientos referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Lanzamientos getReferencia() {
        return referencia;
    }

    public void setReferencia(Lanzamientos referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return  titulo;
    }

  
    
    
    
}
