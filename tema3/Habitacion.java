/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Habitacion {
    private double precio = GeneradorAleatorio.generarDouble(6000) + 2000;
    private boolean ocupada = false;
    private Persona cliente;
    
    public Habitacion(){ //CONSTRUCTOR SIN PARAMETROS (VACIO)
        
    }
    
    //GETTERS
    public double getPrecio(){
        return precio;
    }
    public boolean getOcupada(){
        return ocupada;
    }
    public Persona getCliente(){
        return cliente;
    }
    //SETTERS
    public void setPrecio(double costoHabitacion){
        precio = costoHabitacion;
    }
    public void setOcupada(){
        ocupada = !ocupada;
    }
    public void setCliente(Persona C){
        cliente = C;
        ocupada = true;
    }
    
    public void addAumentoPrecio(int aumento){ // VER, USADA DENTRO DE UN METODO EN LA CLASE HOTEL
        precio = precio + aumento;
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
