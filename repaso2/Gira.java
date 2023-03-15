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
public class Gira extends Recital{
    private String nombreGira;
    private Fecha [] fechas;
    int dimF;
    int dimL;
    int actual;
    
    public Gira(String nombreBanda, int cantTemas, String nombreGira, int cantFechas){
        super(nombreBanda, cantTemas);
        this.nombreGira = nombreGira;
        this.dimF = cantFechas;
        this.fechas = new Fecha[this.dimF];
        this.dimL = 0;
        this.actual = 0;
    }
    
    //SETTERS
    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public void setCantFechas(int cantFechas) {
        this.dimF = cantFechas;
    }
    
    //GETTERS
    public String getNombreGira() {
        return this.nombreGira;
    }

    public int getCantFechas() {
        return this.dimF;
    }
    
    public int getCantFechasConfirmadas(){
        return this.dimL;
    }
    
    //OTROS
    public void agregarFecha(Fecha F){
        this.fechas[this.dimL] = F;
        this.dimL++;
    }
    
    public String actuar(){
        String msj = "Buenas noches " + this.fechas[this.actual].getCiudad() + "\n" + super.actuar();
        this.actual++;
        return msj;
    }
    
    public double calcularCosto(){
        return 30000 * this.getCantFechasConfirmadas();
    }
    
}
