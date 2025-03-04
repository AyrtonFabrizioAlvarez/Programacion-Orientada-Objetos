/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4repaso;

/**
 *
 * @author Coco
 */
public class Trabajador extends Persona{
    private String tarea;
    
    public Trabajador(String unNombre, int unDni, int unaEdad, String oficio){
        super(unNombre, unDni, unaEdad);
        this.tarea = oficio;
    }
    
    //SETTERS
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    //GETTERS
    public String getTarea() {
        return tarea;
    }
    
    //OTROS
    public String toString(){
        return super.toString() + "   Soy " + this.getTarea();
    }
    
}
