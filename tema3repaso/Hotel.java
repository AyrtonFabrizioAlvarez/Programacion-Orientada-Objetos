/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;

/**
 *
 * @author Coco
 */
public class Hotel {
    private Habitacion[] hotel;
    private int dimF;
    
    
    public Hotel(int cantHabitaciones){
        this.dimF = cantHabitaciones;
        this.hotel = new Habitacion[this.dimF]; 
        for (int i = 0; i < dimF; i++) {
            hotel[i] = new Habitacion();
        }
    }
    

    
    
    //METODOS
    public void setHabitacion(Habitacion H, int numHabitacion){
        this.hotel[numHabitacion] = H;
    }
    
    public void aumentarPrecio(int monto){
        for (int i = 0; i < dimF; i++) {
            this.hotel[i].aumentarPrecioUnitario(monto);
        }
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < dimF; i++) {
            if (this.hotel[i].isOcupacion()) {
                msj += "{Habitacion " + (i+1) + ": " + this.hotel[i].getCosto() + ", Ocupada, " + this.hotel[i].getCliente().toString() + "\n";
            }
            else
                msj += "{Habitacion " + (i+1) + ": " + this.hotel[i].getCosto() + ", Libre" + "\n";
        }
        return msj;
    }
}
