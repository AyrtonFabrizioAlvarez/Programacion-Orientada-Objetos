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
public abstract class Coro {
    private String nombreCoro;
    private Director director;
    
    public Coro(String unNombre, Director D){
        this.nombreCoro = unNombre;
        this.director = D;
    }
    
    //SETTERS
    public void setNombreCoro(String nombreCoro) {
        this.nombreCoro = nombreCoro;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    //GETTERS
    public String getNombreCoro() {
        return nombreCoro;
    }

    public Director getDirector() {
        return director;
    }
    
    
    //ABSTRACTOS
    public abstract void agregarCorista(Corista C);
    public abstract boolean isLleno();
    public abstract boolean isOrdenado();
    //OTROS
    
    public String toString(){
        return "Nombre Coro: " + this.getNombreCoro() + "\n" + this.getDirector().toString() + "\n";
    }
    
}
