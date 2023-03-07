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
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo(int lado1, int lado2, int lado3, String colRelleno, String colLinea){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.colorRelleno = colRelleno;
        this.colorLinea = colLinea;        
    }
           
    
    //GETTERS
    public int getLado1(){
        return this.lado1;
    }
    
    public int getLado2(){
        return this.lado2;
    }
    
    public int getLado3(){
        return this.lado3;
    }
    
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    
    public String getColorLinea(){
        return this.colorLinea;
    }
    
    //SETTERS
    public void setLado1(int unLado){
        this.lado1 = unLado;
    }
    
    public void setLado2(int unLado){
        this.lado2 = unLado;
    } 
        
    public void setLado3(int unLado){
        this.lado3 = unLado;
    } 
    
    public void setColRelleno(String unColor){
        this.colorRelleno = unColor;
    }
    
    public void setColLinea(String unColor){
        this.colorLinea = unColor;
    }
    
    
    //OTROS
    public double calcularPerimetro(){
        return (this.lado1 + this.lado2 + this.lado3);
    }
    
    public double calcularArea(){
        double s = (this.lado1 + this.lado2 + this.lado3)/2;
        double x = Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
        return x;
    }
}
