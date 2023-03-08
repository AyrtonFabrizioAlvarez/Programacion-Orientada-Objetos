/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;

/**
 *
 * @author Coco
 */
public class Cliente {
    private String nombre;
    private int dni;
    private int edad;
    
    public Cliente(String unNombre, int unDni, int unaEdad){
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;
    }
    
    //SETTERS
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public void setDni(int unDni){
        this.dni = unDni;
    }
    
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //Otros
    public String toString(){
        return "Nombre: " + this.getNombre() + " Dni: " + this.getDni() + " Edad: " + this.getEdad();
    }
}
