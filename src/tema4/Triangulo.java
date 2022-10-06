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
public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String colRelleno, String colLinea) {
        super(colRelleno, colLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    

    //GETTERS
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    public double calcularPerimetro(){
        return (this.getLado1() + this.getLado2() + this.getLado3());
    }
    
    public double calcularArea(){
        double s = (this.getLado1() + this.getLado2() + this.getLado3()) /2;
        return (int)Math.sqrt(s*(s-this.getLado1())*(s-this.getLado2())*(s-this.getLado3()));
    }
    
    public String toString(){
        return (super.toString() + ", Lados: 1- " + getLado1() + " 2- " + getLado2() + "3- " + getLado3());
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
    
    
}
