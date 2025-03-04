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
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(String colR, String colL, double unLado){
        super(colR, colL);
        this.lado = unLado;
    }
    
    //SETTERS
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //GETTERS
    public double getLado() {
        return lado;
    }
    
    
    //OTROS
    public double obtenerPerimetro(){
        return (this.getLado() * 4);
    }
    
    public double obtenerArea(){
        return (this.getLado() * this.getLado());
    }
    
    public String toString(){
        return super.toString() + "Lado: " + this.getLado();
    }
}
