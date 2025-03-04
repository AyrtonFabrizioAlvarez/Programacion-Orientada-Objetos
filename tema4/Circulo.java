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
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        this.radio = radio;
    }
    
    

    //GETTERS
    public double getRadio() {
        return radio;
    }
    
    public double calcularDiametro(){
        return (this.radio * 2);
    }
    
    public double calcularArea(){
        return (int) ( (this.radio * this.radio) * Math.PI );
    }
    
    public double calcularPerimetro(){
        return (int)(this.calcularDiametro() * Math.PI);
    }
    
    public String toString(){
        return super.toString() + ", Radio: " + this.radio;
    }
    
    //SETTERS
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
