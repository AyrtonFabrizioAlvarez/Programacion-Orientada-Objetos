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
public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String colR, String colL, double lado1, double lado2, double lado3){
        super(colR, colL);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;       
    }
    
    //SETTERS
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    //GETTERS
    public double getLado1(){
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }

    //OTROS
    public double obtenerPerimetro() {
        return (this.lado1 + this.lado2 + this.lado3);
    }
    
    public double obtenerArea(){
        double s = (this.lado2 + this.lado1 + this.lado3)/2;
        double x = Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
        return x;
    }
    
    public String toString(){
        return super.toString() + "Lado 1: " + this.getLado1() + " Lado 2: " + this.getLado2() + " Lado 3: " + this.getLado3();
    }
}
