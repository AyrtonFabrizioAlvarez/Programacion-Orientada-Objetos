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
public class Director extends Persona {
    private int antiguedad;

    public Director(int antiguedad, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.antiguedad = antiguedad;
    }
    
    
    //GETTERS

    public int getAntiguedad() {
        return antiguedad;
    }
    
    //SETTERS
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public String toString(){
        return "Nombre: " + this.getNombre() + "\n" + 
               "Dni: " + this.getDni() + "\n" + 
               "Edad: " + this.getEdad() + "\n" + 
                "Antiguedad: " + this.antiguedad + "\n";
    }
}
