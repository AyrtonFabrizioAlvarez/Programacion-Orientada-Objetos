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
public class Persona {
    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public int getEdad(){
        return this.edad = edad;
    }
    
    public String toString(){
        return "Mi nombre es: " + getNombre() + ", mi dni es: " + getDni() + " y tengo " + getEdad() + " años";
    }

    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}
