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
public class Gira extends Recital{
    private String nombre;
    private Fecha [] vectorFechas;
    private int dimF;
    private int dimL;
    private int actual;

    public Gira(String nombreGira, int cantFechas, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.nombre = nombreGira;
        this.dimF = cantFechas;
        this.vectorFechas = new Fecha[dimF];
        this.dimL = 0;
        this.actual = 0;
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

    public int getActual() {
        return actual;
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

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    //OTROS METODOS
    public void agregarFecha(Fecha F){
        this.vectorFechas[this.dimL] = F;
        this.dimL++;
    }
    
    public String actuar(){
        String msj = "Buenas noches " + this.vectorFechas[actual].getCiudad() + "\n";
        this.actual++;
        return msj + super.actuar();
    }
    
    //ABSTRACTOS
    public int calcularCosto(){
        return this.getDimL() * 30000;
    }
}
