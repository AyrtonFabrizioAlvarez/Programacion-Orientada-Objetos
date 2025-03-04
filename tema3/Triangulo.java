/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Coco
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo (double ladoUno, double ladoDos, double ladoTres, String colRelleno, String colLinea){
        this.lado1 = ladoUno;
        this.lado2 = ladoDos;
        this.lado3 = ladoTres;
        this.colorRelleno = colRelleno;
        this.colorLinea = colLinea;
    }
    
    public double getLado1() {
        return this.lado1;
    }
    public double getLado2() {
        return this.lado2;
    }
    public double getLado3() {
        return this.lado3;
    }
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    public String getColorLinea() {
        return this.colorLinea;
    }
    public void setLado1(double unLado) {
        this.lado1 = unLado;
    }
    public void setLado2(double unLado){
        this.lado2 = unLado;
    }
    public void setLado3(double unLado){
        this.lado3 = unLado;
    }
    public void setColorRelleno(String unColor){
        this.colorRelleno = unColor;
    }
    public void setColorLinea(String unColor){
        this.colorLinea = unColor;
    }
    public double getPerimetro() {
        return (this.getLado1() + this.getLado2() + this.getLado3());
    }
    public double getArea() {
        double s = (this.getLado1() + this.getLado2() + this.getLado3()) /2;
        return Math.sqrt(s*(s-this.getLado1())*(s-this.getLado2())*(s-this.getLado3()));
    }
    
}
