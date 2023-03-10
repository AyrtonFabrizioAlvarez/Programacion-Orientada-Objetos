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
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;
    
    public Empleado(String unNombre, double sueldo, int unaAntiguedad){
        this.nombre = unNombre;
        this.sueldoBasico = sueldo;
        this.antiguedad = unaAntiguedad;
    }
    
    //SETTERS
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public void setSueldoBasico(double sueldo){
        this.sueldoBasico = sueldo;
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAntiguedad(){
        return this.antiguedad;
    }
    
    //ABSTRACTOS
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
    //OTROS
    public double calcularSueldoBasico(){
        return  ( (this.getSueldoBasico() * 0.1) * this.getAntiguedad() ) + this.getSueldoBasico();
    }
    public String toString(){
        return "Nombre: " + this.getNombre() + " Sueldo: " + this.calcularSueldoACobrar()+ " Efectividad: " + this.calcularEfectividad();
    }
}
