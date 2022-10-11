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
public class CoroSemiCircular extends Coro{
    private Corista [] vectorCoristas;
    private int dimF;
    private int dimL;

    public CoroSemiCircular(int dimF, String nombreCoro, int antiguedad, String nombre, int dni, int edad) {
        super(nombreCoro, antiguedad, nombre, dni, edad);
        this.vectorCoristas = new Corista[dimF];
        this.dimF = dimF;
        this.dimL = 0;
    }
    
    //GETTERS

    public int getDimF() {
        return dimF;
    }
    
    //SETTERS

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }
    
    //ABSTRACTOS
    public void agregarCorista(Corista C){
        this.vectorCoristas[dimL] = C;
        dimL++;
    }
    
    public boolean coroLleno(){
        return (this.dimL == this.dimF);
    }
    
    public boolean ordenCoro(){
        boolean ok = true;
        int pos = 0;
        while ( (ok) && (pos < dimL-1) ) {
            if (this.vectorCoristas[pos].getTono() >= this.vectorCoristas[pos + 1].getTono()) {
                ok = true;
                pos++;
            }
            else{
                ok = false;
            }
        }
        return ok;
    }

    public String toString(){
        String msj = "";
        for (int i = 0; i < this.dimL; i++) {
            msj = msj + this.vectorCoristas[i].toString();
        }
        return super.toString() + msj;
    }

}
