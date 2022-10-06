/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Coco
 */
public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;
    
    //CONSTRUCTOR
    public Subsidio (int monto, String motivo){
        this.monto = monto;
        this.motivo = motivo;
        this.otorgado = false;
    }
    
    //GETTERS
    public double getMonto() {
        return monto; 
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean getOtorgado() {
        return otorgado;
    }
    //SETTERS

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setOtorgado() {
        this.otorgado = !otorgado;
    }
    
}
