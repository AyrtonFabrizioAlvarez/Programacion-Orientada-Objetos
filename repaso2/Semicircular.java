/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

/**
 *
 * @author Coco
 */
public class Semicircular extends Coro {
    private Corista [] vectorCoro;
    private int dimL;
    private int dimF;
    
    public Semicircular(String unNombre, Director D, int cantCoristas){
        super(unNombre, D);
        this.dimF = cantCoristas;
        this.dimL = 0;
        this.vectorCoro = new Corista[this.dimF];
    }
    
    //SETTERS
    public void setTamañoCoro(int cantCoristas) {
        this.dimF = cantCoristas;
    }
    
    //GETTERS
    public int getcantCoristas() {
        return this.dimF;
    }
   
    //OTROS
    public void agregarCorista(Corista C){
        this.vectorCoro[this.dimL] = C;
        this.dimL++;
    }
    
    public boolean isLleno(){
        return (dimL == dimF);
    }
    
    public boolean isOrdenado(){
        int i = 0;
        boolean ordenado = true;
        while ( (i < this.dimL-1) && (ordenado) ) {
            if (this.vectorCoro[i].getTono() < this.vectorCoro[(i+1)].getTono()) {
                ordenado = false;
            }
            i++;
        }
        return ordenado;
    }
    
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.getcantCoristas(); i++) {
            msj += this.vectorCoro[i].toString();
        }
        return msj;
    }
}
