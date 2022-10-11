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
public class Corista extends Persona {
    private int tono;

    public Corista(int tono, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tono = tono;
    }
    
    //GETTERS

    public int getTono() {
        return tono;
    }
    
    //SETTERS

    public void setTono(int tono) {
        this.tono = tono;
    }
    
    public String toString(){
        return "Nombre: " + this.getNombre() + "\n" + 
               "Dni: " + this.getDni() + "\n" + 
               "Edad: " + this.getEdad() + "\n" + 
               "Tono: " + this.getTono() + "\n";
    }
    
}
