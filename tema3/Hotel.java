/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Coco
 */
public class Hotel {
    private Habitacion [] vectorHotel;
    private int dimF;

    
    public Hotel(int dimFisica) { //CONSTRUCTOR DE LA CLASE HOTEL
        this.vectorHotel = new  Habitacion[dimFisica];
        dimF = dimFisica;
        for (int i = 0 ; i < dimF ; i++) {
            vectorHotel[i] = new Habitacion();    
        }
    }
        
    public Hotel(){
    
    }
    
    //SETTERS
    
    public void setHabitacion(Habitacion H, int numHabitacion){ //AGREGO UNA HABITACION AL VECTOR
        vectorHotel[numHabitacion] = H;
    }
    
    public void setAumentoGeneral(int aumento){
        for (int i = 0; i < dimF; i++) {
            vectorHotel[i].addAumentoPrecio(aumento);
        }
    }
    
    
    //GETTERS
    
    public boolean estaOcupado(int pos) {
        return this.vectorHotel[pos].getOcupada();
    }
    
    @Override
    public String toString(){
        String msj = "";
        for (int i = 0; i < dimF; i++) {
            if (vectorHotel[i].getOcupada()) {
                msj = msj + "Habitacion " + (i+1) + ": " + vectorHotel[i].getPrecio() + ", ocupada, " + vectorHotel[i].getCliente().toString() + "\n";
            }
            else{
                msj = msj + "Habitacion " + (i+1) + " libre " + "\n";
            }  
        }
        return msj;
    }
    
}


/*4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}*/