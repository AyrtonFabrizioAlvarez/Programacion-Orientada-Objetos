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
public abstract class Recital {
    private String nombreBanda;
    private String [] listaTemas;
    int dimF;
    int dimL;
    
    public Recital(String unNombre, int cantTemas){
        this.nombreBanda = unNombre;
        this.dimF = cantTemas;
        this.listaTemas = new String[this.dimF];
        this.dimL = 0;
    }
    
    //SETTERS
    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public void setCantTemas(int cantTemas) {
        this.dimF = cantTemas;
    }
    
    //GETTERS
    public String getNombreBanda() {
        return this.nombreBanda;
    }

    public int getCantTemas() {
        return this.dimF;
    }
    
    //OTROS
    public void agregarTema(String tema){
        if (this.dimL <this.getCantTemas()) {
            this.listaTemas[this.dimL] = tema;
            this.dimL++;
        }
        else
            System.out.println("Ya no se pueden agregar mas temas");
        
    }
    
    public String actuar(){
        String msj = "";
        for (int i = 0; i < this.dimL; i++) {
            if (this.listaTemas[i] != null) {
                msj += "Y ahora tocaremos: " + this.listaTemas[i] + "\n";
            }
        }
        return msj;
    }
    
    //ABSTRACTOS
    public abstract double calcularCosto();
}
