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
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;
    
    //CONSTRUCTOR
    public Circulo(double rad, String colRelleno, String colLinea){
        this.radio = rad;
        this.colorRelleno = colRelleno;
        this.colorLinea = colLinea;
    }

    //SETTERS

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    
    //GETTERS
    public double getRadio() {
        return this.radio;
    }

    public String getColorRelleno() {
        return this.colorRelleno;
    }

    public String getColorLinea() {
        return this.colorLinea;
    }
    
    //OTROS METODOS
    public double calcularDiametro(){
        return (this.radio * 2);
    }
    public int calcularPerimetro(){
        return (int)(this.calcularDiametro() * Math.PI);
    }
    public int calcularArea(){
        return (int) ( (this.radio * this.radio) * Math.PI );
    }
    
}
