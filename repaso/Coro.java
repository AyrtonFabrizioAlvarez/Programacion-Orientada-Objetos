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
public abstract class Coro {
    private String nombreCoro;
    private Director director;
    private Corista corista;


    public Coro(String nombreCoro, int antiguedad, String nombre, int dni, int edad) { //CONSTRUCTOR PARA CORO SEMICIRCULAR (VECTOR CORISTAS)
        this.nombreCoro = nombreCoro;
        this.director = new Director(antiguedad, nombre, dni, edad);
    }    
    
    
    //GETTERS

    public String getNombreCoro() {
        return nombreCoro;
    }

    public Director getDirector() {
        return director;
    }

    public Corista getCorista() {
        return corista;
    }
    
    //SETTERS

    public void setNombreCoro(String nombreCoro) {
        this.nombreCoro = nombreCoro;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCorista(Corista corista) {
        this.corista = corista;
    }
    
    public String toString(){
        return "Nombre del coro: " + this.getNombreCoro() + "\n" + 
                this.director.toString() + "\n";
    }
    
    
    //ASBTRACTOS
    public abstract void agregarCorista(Corista C);
    public abstract boolean coroLleno();
    public abstract boolean ordenCoro();
}
