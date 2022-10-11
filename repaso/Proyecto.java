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
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador [] vectorInvestigadores = new Investigador[50];
    private int dimL;
    
    //CONSTRUCTOR
    public Proyecto(String nombre, int codigo, String nomDirector){
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombreDirector = nomDirector;
        this.dimL = 0;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    public int getDimL(){
        return this.dimL;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNombreDirector(String nomDirector){
        this.nombreDirector = nomDirector;
    }
    
    //COMPORTAMIENTOS PROPIOS
    public void agregarInvestigador(Investigador I){
        this.vectorInvestigadores[dimL] = I;
        dimL++;
    }
    
    public double dineroTotalOtorgado(){
        double total = 0;
        for (int i = 0; i < this.dimL; i++) {
            total = total + this.vectorInvestigadores[i].calcularTotalSubsidios();
        }
        return total;
    }
    
    public void otorgarTodos(String nombreBuscado){
        boolean encontre = false;
        int pos = 0;
        while ( (!encontre) && (pos < this.dimL) ) {
            if (this.vectorInvestigadores[pos].getNombre().equalsIgnoreCase(nombreBuscado)){
                encontre = true;
            }
            else{
                pos++;
            }
        }
        if (encontre) {
            this.vectorInvestigadores[pos].otorgarNegados();
        }
        else{
            System.out.println("El investigador " + nombreBuscado + " no se encuentra en el proyecto");
        }
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.dimL; i++) {
            msj = msj + this.vectorInvestigadores[i].toString() + "\n";
        }
        String msjDefinitivo = "Nombre del Proyecto: " + this.nombre + "\n" + 
                            "Codigo: " + this.codigo + "\n" + 
                            "Nombre del Director: " + this.nombreDirector + "\n" +
                            "Total subsidios del Proyecto: " + this.dineroTotalOtorgado() + "\n\n" + 
                            msj;
        return msjDefinitivo;    
    }
            
}
