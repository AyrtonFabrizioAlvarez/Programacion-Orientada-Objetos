/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;


public class Persona {
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        unNombre = nombre;
        unDNI = DNI;
        unaEdad = edad;
    }

    public Persona() {
    }
    
    
    
    //GETTERS
    
    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //TOSTRING
    
    public String toString (){
        return "Mi nombre es: " + this.nombre + "\n" + 
               "DNI: " + this.DNI + "\n" + 
               "Edad: " + this.edad;
    }
 
}
