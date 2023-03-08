/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Hotel H = new Hotel(20);
        
        System.out.println("Ingrese el nombre del cliente");
        String nombre = Lector.leerString();
        while (!nombre.equals("coco")) {
            int dni = GeneradorAleatorio.generarInt(1001);
            int edad = GeneradorAleatorio.generarInt(81);
            Cliente C = new Cliente(nombre, dni, edad);
            
            Habitacion habitacion = new Habitacion();
            habitacion.setCliente(C);
            
            int num = GeneradorAleatorio.generarInt(20);
            H.setHabitacion(habitacion, num);
            
            System.out.println("Ingrese el nombre del cliente");
            nombre = Lector.leerString();
        }
        
        System.out.println(H.toString());
        H.aumentarPrecio(1000);
        System.out.println(H.toString());
        
        
        
    }
    
}
