/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Coco
 */
public class Auto {
    private String nombreDueño;
    private String patente;

    public Auto(String nombreDueño, String patente) {
        this.nombreDueño = nombreDueño;
        this.patente = patente;
    }

    public Auto() {
        
    }
    
    
    
    //GETTERS
    public String getNombreDueño() {
        return nombreDueño;
    }

    public String getPatente() {
        return patente;
    }
    
    //SETTERS
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    //OTROS METODOS
    public String toString(){
        return "Propietario: " + this.getNombreDueño() + " Patente: " + this.getPatente();
    }



}
