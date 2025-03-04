/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialobjetos.superclase;

/**
 *
 * @author Coco
 */
public class Bien {
    private String descripcion;
    private int cantidad;
    private double costo;

    public Bien(String descripcion, int cantidad, double costo) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
    }
    
    //GETTERS

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }
    
    //SETTERS

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    //OTROS METODOS
    
    
    public String toString(){
        return "Descripcion: " + this.descripcion + "\n";
    }
}
