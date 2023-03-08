/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class Habitacion {
    private int costo = GeneradorAleatorio.generarInt(6001)+2000;
    private boolean ocupacion = false;
    private Cliente cliente;
    
    public Habitacion(){
        
    }
    
    //SETTERS
    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setOcupacion(boolean ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.setOcupacion(true);
    }
    
    //GETTERS
    public int getCosto() {
        return costo;
    }

    public boolean isOcupacion() {
        return ocupacion;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    //OTROS
    public void aumentarPrecioUnitario(int monto){
        this.costo += monto;
    }
    
}
