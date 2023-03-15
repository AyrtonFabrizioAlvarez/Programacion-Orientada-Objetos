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
public class Director extends Persona{
    private int antiguedad;

    public Director(String nombre, int dni, int edad, int antiguedad) {
        super(nombre, dni, edad);
        this.antiguedad = antiguedad;
    }
    
    //SETTERS
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    //GETTERS
    public int getAntiguedad() {
        return antiguedad;
    }
    
    
    //OTROS
    public String toString(){
        return super.toString() + "Antiguedad: " + this.getAntiguedad() + "\n";
    }
    
    
    
}
