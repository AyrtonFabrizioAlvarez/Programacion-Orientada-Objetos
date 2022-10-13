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
public class SubsidioBienes extends Subsidio{
    private Bien [] vectorBienes;
    private int dimF;
    private int dimL;

    public SubsidioBienes(int dimF, String nombreInvestigador, String nombreTrabajo, String fecha) {
        super(nombreInvestigador, nombreTrabajo, fecha);
        this.dimF = dimF;
        vectorBienes = new Bien[this.dimF];
        this.dimL = 0;
    }
    
    //GETTERS

    public int getDimF() {
        return dimF;
    }

    public int getDimL() {
        return dimL;
    }
    
    //SETTERS

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
    //OTROS METODOS
    
    public void agregarBien(Bien B){
        this.vectorBienes[dimL] = B;
        dimL++;
    }
    
    public double montoTotalSubsidio(){
        double monto = 0;
        for (int i = 0; i < this.dimL; i++) {
            monto = this.vectorBienes[i].getCantidad() * this.vectorBienes[i].getCosto();
        }
        return monto;
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.dimL; i++) {
            msj = msj + "Bien numero " + i + "\n" + 
                        this.vectorBienes[i].toString();
        }
        return super.toString() + "\n" + 
               "Monto Total: " + this.montoTotalSubsidio() + "\n" + 
               "Descripcion de Bienes Solicitados: " + "\n" +
               msj;
                
    }
}
