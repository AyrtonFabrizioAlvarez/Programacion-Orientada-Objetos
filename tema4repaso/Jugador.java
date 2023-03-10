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
public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;
    
    public Jugador(String unNombre, double sueldo, int antiguedad, int cantPartidos, int cantGoles){
        super(unNombre, sueldo, antiguedad);
        this.partidosJugados = cantPartidos;
        this.golesAnotados = cantGoles;
    }
    
    //SETTERS
    public void setPartidosJugados(int partidos){
        this.partidosJugados = partidos;
    }
    
    public void setGolesAnotados(int goles){
        this.golesAnotados = goles;
    }
    
    //GETTERS
    public int getPartidosJugados(){
        return this.partidosJugados;
    }
    
    public int getGolesAnotados(){
        return this.golesAnotados;
    }
    
    
    //OTROS
    public double calcularEfectividad(){

        return (double)(this.getGolesAnotados()) / this.getPartidosJugados();
    }
    
    public double calcularSueldoACobrar(){
        double sueldo = super.calcularSueldoBasico();
        if (this.calcularEfectividad() > 0.5) {
             sueldo += this.getSueldoBasico();
        }
        return sueldo;
    }
}
