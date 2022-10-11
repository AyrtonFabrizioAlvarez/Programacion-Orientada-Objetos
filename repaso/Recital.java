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
public abstract class Recital {
    private String nombre;
    private String [] vectorTemas;
    private int dimF;
    private int dimL;

    public Recital(String nombreBanda, int cantTemas) {
        this.nombre = nombreBanda;
        this.dimF = cantTemas;
        this.vectorTemas = new String[dimF];
        this.dimL = 0;
    }
    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getDimF() {
        return dimF;
    }

    public int getDimL() {
        return dimL;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    //OTROS METODOS
    public void agregarTema(String tema){
        if ((this.dimL + 1) <= this.dimF) {
            this.vectorTemas[this.dimL] = tema;
            this.dimL++;
        }
        else {
            System.out.println("La cancion " + tema + " no se puede agregar ya que el repertorio esta completo");
        }
        
    }
    
    public String actuar(){
        String msj = "";
        for (int i = 0; i < this.dimL; i++) {
            msj = msj + "Y ahora tocaremos " + this.vectorTemas[i] + "\n";
        }
        return msj;
    }
    
    //ABSTRACTOS
    public abstract int calcularCosto();
}
