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
public class Autor {
    public String nombre; 
    public String biografia;
    public String origen;
    
    
    public Autor(String nombre, String biografia, String origen){
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getOrigen() {
        return origen;
    }
    
    //OTROS
    public String toString(){
        return "Nombre: " + this.nombre + " Biografia: " + this.biografia + " Origen: " + this.origen;
    }
    
}   
