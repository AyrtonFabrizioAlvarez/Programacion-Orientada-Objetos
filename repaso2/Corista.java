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
public class Corista extends Persona{
    private int tono;

    public Corista(String nombre, int dni, int edad, int tono) {
        super(nombre, dni, edad);
        this.tono = tono;
    }
    
    //SETTERS
    public void setTono(int tono) {
        this.tono = tono;
    }
    
    //GETTERS
    public int getTono() {
        return tono;
    }
    
    //OTROS
    public String toString(){
        return super.toString() + "Tono: " + this.getTono() + "\n";
    }
    
}
