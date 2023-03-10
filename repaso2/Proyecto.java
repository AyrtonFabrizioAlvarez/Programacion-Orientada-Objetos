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
public class Proyecto {
    private String nombreProyecto;
    private int codigo;
    private String nombreDirector;
    private int dimL;
    private Investigador [] investigadores = new Investigador[50];
    
    public Proyecto(String nomProyecto, int unCodigo, String nomDirector){
        this.nombreProyecto = nomProyecto;
        this.codigo = unCodigo;
        this.nombreDirector = nomDirector;
        this.dimL = 0;
    }
    
    //SETTERS
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    
    //GETTERS
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }
    
    
    //OTROS
    public void agregarInvectigador(Investigador I){
        if (this.dimL < 50) {
            this.investigadores[dimL] = I;
            this.dimL++;   
        }        
    }
    
    public double dineroTotalOtorgado(){
        double total = 0;
        for (int i = 0; i < dimL; i++) {
            total += this.investigadores[i].calcularTotalSubsidios();
        }
        return total;
    }
    
    public void otorgarTodos(String buscado){
        int pos = 0;
        boolean ok = false;
        while ( (pos < dimL) && (!ok) ) {
            if (this.investigadores[pos].getNombre().equals(buscado)) {
                this.investigadores[pos].otorgarNegados();
                ok = true;
            }
            pos++;
        }
        if (ok) {
            System.out.println("Se otorgaron los subsidios correctamente al Investigador " + buscado);
        }
        else
            System.out.println("El Investigador " + buscado + " no se encuentra en el proyecto");
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < dimL; i++) {
            msj += (i+1) + "\n" + this.investigadores[i].toString() + "\n" + "\n";
        }
        return "Nombre del Proyecto: " + this.getNombreProyecto() + "\n" + 
               "Codigo: " + this.getCodigo() + "\n" +  
               "Nombre del Director: " + this.getNombreDirector() + "\n" +  
               "Total de dinero otorgado: " + this.dineroTotalOtorgado() + "\n" + 
                msj;
    }
}
