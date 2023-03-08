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
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String colR, String colL, double unRadio){
        super(colR, colL);
        this.radio = unRadio;
    }
    
    //SETTERS
    public void setRadio(double unRadio){
        this.radio = unRadio;
    }
    
    //GETTERS
    public double getRadio(){
        return this.radio;
    }
    
    //OTROS
    public double calcularDiametro(){
        return (this.getRadio()*2);
    }
    
    public double obtenerPerimetro(){
        return (Math.PI * this.calcularDiametro());
    }
    
    public double obtenerArea(){
        return (Math.PI * (this.getRadio() * this.getRadio()));
    }
    
    public String toString(){
        return super.toString() + "Radio: " + this.getRadio();
    }
}
