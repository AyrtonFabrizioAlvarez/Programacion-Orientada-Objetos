/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

/**
 *
 * @author Coco
 */
public class Auto {
    private String nombre;
    private String patente;

    public Auto(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }
    
    //OTROS
    public String toString(){
        return "Nombre propietario: " + this.getNombre() + "\n" + 
               "Patente: " + this.getPatente() + "\n";
    }
    
    
}
