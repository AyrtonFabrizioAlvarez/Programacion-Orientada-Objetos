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
public class Ej04Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        int dimF = 5;
       // Habitacion [] vectorHotel = new Habitacion[dimF];   //DECLARO Y RESERVO ESPACIO EN MEMORIA PARA MI VECTOR
        
        Hotel hotel = new Hotel(dimF);    //CREO UNA INSTANCIA(OBJETO) DE LA CLASE HOTEL
                                              //1-RESERVA DE MEMORIA, SE INICIAN V.I. A VALORES POR DEFECTO O EXPLICITO SI LO HAY
                                              //2-EJECUCION DEL CONSTRUCTOR(METODO PARA INICIAR V.I. CON VALORES QUE SE PASAN POR PARAMETRO)
                                              //3-ASIGNACION DE LA REFERENCIA A LA VARIABLE

        for (int i = 0; i < dimF; i++) {
            String nombre = GeneradorAleatorio.generarString(6);
            int edad = GeneradorAleatorio.generarInt(81);
            int dni = GeneradorAleatorio.generarInt(999999) + 38000000;
            
            Persona C = new Persona(nombre, dni, edad);    //INSTANCIO MI CLASE PERSONA EN LA VARIABLE C UTILIZANDO EL CONSTRUCTOR
            Habitacion H = new Habitacion();    //INSTANCIO MI CLASE HABITACION CON EL CONSTRUCTOR VACIO ¿COMO SE LE DICE A ESTE CONSTRUCTOR?
        
            H.setCliente(C); //EN LA CLASE HABITACION PASO COMO PARAMETRO MI CLIENTE PARA QUE SEA EL VALOR DE V.I.(cliente) DEL OBJ HABITACION
            int pos = GeneradorAleatorio.generarInt(5);
            if (!hotel.estaOcupado(pos)) {
                hotel.setHabitacion(H, pos); 
            }

        }
        
        System.out.println(hotel.toString());   //MUESTRO EL HOTEL 
        
        hotel.setAumentoGeneral(1000);          //AUMENTO VALOR (METODO DE HOTEL QUE LLAMA A METODO DE HABITACION) LA IDEA FUE POR SUMAR TANTO A
                                                // LAS HABITACIONES YA RESERVADAS COMO EL PRECIO DE LAS NUEVAS
        
        System.out.println(hotel.toString());
        
        //SI NO ESTAN LAS POSICIONES DE MANERA CONSECUTIVA(TODAS COMPLETAS?) NULLPOINTEREXCEPTION (POR ESO CARGO MANUALMENTE EL NUMERO DE HABITACION)
        //AL FINAL DEL FOR DE TOSTRING DE LA CLASE HOTEL ME PEDIA UN RETURN Y NO SUPE COMO SOLUCIONARLO
    }
    
}
