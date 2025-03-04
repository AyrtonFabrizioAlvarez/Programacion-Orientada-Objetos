/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Coco
 */
public class Trabajador extends Persona {
    private String tarea;

    public Trabajador(String tarea, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tarea = tarea;
    }
    
    //GETTERS
     public String getTarea() {
        return tarea;
    }
     
     public String toString(){
        return super.toString() + ". Soy " + getTarea();
     }   
     
    //SETTERS

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

   
    
    
}
