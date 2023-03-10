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
public class Entrenador extends Empleado {
    private int campeonatosGanados;
    
    public Entrenador(String unNombre, double sueldo, int antiguedad, int campeonatos){
        super(unNombre, sueldo, antiguedad);
        this.campeonatosGanados = campeonatos;
    }
    
    //SETTERS
    public void setCampeonatosGanados(int cantCampeonatos){
        this.campeonatosGanados = cantCampeonatos;
    }
    
    //GETTERS
    public int getCamponatosGanados(){
        return this.campeonatosGanados;
    }
    
    //OTROS
    public double calcularEfectividad(){
        return (this.getCamponatosGanados() / this.getAntiguedad());
    }
    
    public double calcularSueldoACobrar(){
        double sueldo = super.calcularSueldoBasico();
        if (this.getCamponatosGanados() > 10) {
            sueldo += 50000;
        }
        else if (this.getCamponatosGanados() > 4) {
            sueldo += 30000;
        }
        else if (this.campeonatosGanados > 0) {
            sueldo += 5000;
        }
        return sueldo;
    }
}
