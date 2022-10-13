/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialobjetos.superclase;

/**
 *
 * @author Coco
 */
public class SubsidioEstadia extends Subsidio {
    private String destino;
    private double costoPasajes;
    private int cantDias;
    private double costoDia;

    public SubsidioEstadia(String destino, double costoPasajes, int cantDias, double costoDia, String nombreInvestigador, String nombreTrabajo, String fecha) {
        super(nombreInvestigador, nombreTrabajo, fecha);
        this.destino = destino;
        this.costoPasajes = costoPasajes;
        this.cantDias = cantDias;
        this.costoDia = costoDia;
    }
    
    //GETTERS

    public String getDestino() {
        return destino;
    }

    public double getCostoPasajes() {
        return costoPasajes;
    }

    public int getCantDias() {
        return cantDias;
    }

    public double getCostoDia() {
        return costoDia;
    }
    
    //SETTERS

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCostoPasajes(double costoPasajes) {
        this.costoPasajes = costoPasajes;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }
    
    //OTROS METODOS
    
    public double montoTotalSubsidio(){
        return this.costoPasajes + (this.cantDias * this.costoDia);
    }
    
    public String toString(){
        return super.toString() + "\n" + 
               "Monto Total: " + this.montoTotalSubsidio() + "\n" + 
               "Lugar de Destino: " + this.destino + "\n" + 
               "Dias: " + this.cantDias + "\n";
    }
}
