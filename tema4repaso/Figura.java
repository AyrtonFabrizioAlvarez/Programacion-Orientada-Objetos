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
public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;
    
    public Figura(String colR, String colL){
        this.colorRelleno = colR;
        this.colorLinea = colL;
    }
    
    //SETTERS
    public void setColorRelleno(String unColor){
        this.colorRelleno = unColor;
    }
    
    public void setColorLinea(String unColor){
        this.colorLinea = unColor;
    }
    
    //GETTERS
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    
    public String getColorLinea(){
        return this.colorLinea;
    }
    
    
    //OTROS
    public String toString(){
        return "CR: " + this.getColorRelleno() + " CL: " + this.getColorLinea() + "\n" +
               "Perimetro: " + this.obtenerPerimetro() + "\n";
    }
    
    public void despintar(){
        this.setColorRelleno("blanco");
        this.setColorLinea("negro");
    }
    
    //ABSTRACTOS
    public abstract double obtenerPerimetro();
    public abstract double obtenerArea();
}
