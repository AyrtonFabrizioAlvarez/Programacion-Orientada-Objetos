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
public class Jugador extends Empleado {
    private int partidosJugados;
    private int goles;

    public Jugador(int partidosJugados, int goles, String nombre, double sueldo, int antiguedad) {
        super(nombre, sueldo, antiguedad);
        this.partidosJugados = partidosJugados;
        this.goles = goles;
    }
    
    

    //GETTERS
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getGoles() {
        return goles;
    }
    
    public String toString(){
        return super.toString();
    }
    
    public double calcularEfectividad(){
        return ( this.getGoles() / this.getPartidosJugados() );
    }
    
    public double calcularSueldoACobrar(){
        
        if (this.calcularEfectividad() > 0.5) {
            return super.getSueldoTotal() + this.getSueldo();
        }
        else {
            return super.getSueldoTotal();
        }
    }
    
    //SETTERS

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
}
