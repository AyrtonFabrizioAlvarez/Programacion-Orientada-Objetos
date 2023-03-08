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
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;
    
    public Circulo(double unRadio, String colR, String colL){
        this.radio = unRadio;
        this.colorRelleno = colR;
        this.colorLinea = colL;
    }
    
    //SETTERS
    public void setRadio(double unRadio){
        this.radio = unRadio;
    }
    
    public void setColorRelleno(String unColor){
        this.colorRelleno = unColor;
    }
    
    public void setColorLinea(String unColor){
        this.colorLinea = unColor;
    }
    
    //GETTERS
    public double getRadio(){
        return this.radio;
    }
    
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    
    public String getColorLinea(){
        return this.colorLinea;
    }
    
    //OTROS
    public double calcularDiametro(){
        return (this.getRadio()*2);
    }
    public double calcularPerimetro(){
        return (Math.PI * this.calcularDiametro());
    }
    
    public double calcularArea(){
        return (Math.PI * (this.getRadio() * this.getRadio()));
    }
}
