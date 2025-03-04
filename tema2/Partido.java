/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;


public class Partido {
    private String local;
    private String visitante;
    private int golesLocal; 
    private int golesVisitante;
    
    public Partido(){
    
    }

    public Partido(String unLocal, String unVisitante, int unGolLocal, int unGolVisitante){
        local = unLocal;
        visitante = unVisitante;
        golesLocal = unGolLocal;
        golesVisitante = unGolVisitante;
    }

    
    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setLocal(String unEquipo) {
        local = unEquipo;
    }

    public void setVisitante(String unEquipo) {
        visitante = unEquipo;
    }

    public void setGolesLocal(int unosGoles) {
        golesLocal = unosGoles;
    }

    public void setGolesVisitante(int unosGoles) {
        golesVisitante = unosGoles;
    }
    
    public boolean hayGanador (){
        return (this.golesLocal != this.golesVisitante);
    }
    
    public String getGanador(){
        String ganador = new String();
        if (this.golesVisitante > this.golesLocal) {
            ganador = this.visitante;
        }
        else 
            if (this.golesLocal > this.golesVisitante){
                ganador = this.local;
            }
        return ganador;
    }
    
    public boolean hayEmpate(){
        return (this.golesLocal == this.golesVisitante);
    }
    
    public String toString(){
        return "{" + this.local.toUpperCase() + " " + this.golesLocal + " VS " + this.visitante.toUpperCase() + " " + this.golesVisitante + "}";
    }
}
