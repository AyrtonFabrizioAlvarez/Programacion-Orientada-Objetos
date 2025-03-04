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
public class Entrenador extends Empleado {
    private int campeonatosGanados;

    public Entrenador(int campeonatosGanados, String nombre, double sueldo, int antiguedad) {
        super(nombre, sueldo, antiguedad);
        this.campeonatosGanados = campeonatosGanados;
    }
    
    //GETTERS
    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }
    
    public String toString(){
        return super.toString();
    }
    
    public double calcularEfectividad(){
        return ( this.getCampeonatosGanados() / this.getAntiguedad() );
    }
    
    public double calcularSueldoACobrar(){
        if (getCampeonatosGanados() <= 4) {
            return super.getSueldoTotal() + ( this.getCampeonatosGanados() * 5000 );
        }
        else  {
            if ( (getCampeonatosGanados() >= 5) && ( getCampeonatosGanados() < 10 ) ){
                return super.getSueldoTotal() + (this.getCampeonatosGanados() * 30000 );
            }
            else{
                return super.getSueldoTotal() + ( this.getCampeonatosGanados() * 50000 );
            }
        }
    }
    
    //SETTERS
    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    
    
}
