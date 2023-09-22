/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_avrilromero;

/**
 *
 * @author Valeria Romero
 */
public class Canciones {
    private String titulo;
    private int duracion;
    private Lanzamientos referencia;

    public Canciones() {
    }

    public Canciones(String titulo, int duracion, Lanzamientos referencia) {
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
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
