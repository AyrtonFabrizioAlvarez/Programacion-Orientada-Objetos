/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ocasional eventoOcasional = new Ocasional("Banda Ocasional", 10, "privado", "Ayrton", GeneradorAleatorio.generarInt(30)+1);
        
        eventoOcasional.agregarTema("cancion1");
        eventoOcasional.agregarTema("cancion2");
        eventoOcasional.agregarTema("cancion3");
        eventoOcasional.agregarTema("cancion4");
        eventoOcasional.agregarTema("cancion5");
        eventoOcasional.agregarTema("cancion6");
        eventoOcasional.agregarTema("cancion7");
        eventoOcasional.agregarTema("cancion8");
        eventoOcasional.agregarTema("cancion9");
        eventoOcasional.agregarTema("cancion10");
        
        System.out.println("El costo total del evento es: " + eventoOcasional.calcularCosto() + "\n");
        System.out.println(eventoOcasional.actuar());*/

        Gira eventoGira = new Gira("Banda Gira", 15, "Gira Prueba", 10);
        
        Fecha F1 = new Fecha("Fecha1", 1);
        eventoGira.agregarFecha(F1);
        Fecha F2 = new Fecha("Fecha2", 2);
        eventoGira.agregarFecha(F2);
        Fecha F3 = new Fecha("Fecha3", 3);
        eventoGira.agregarFecha(F3);
        Fecha F4 = new Fecha("Fecha4", 4);
        eventoGira.agregarFecha(F4);
        Fecha F5 = new Fecha("Fecha5", 5);
        eventoGira.agregarFecha(F5);
        
        
        eventoGira.agregarTema("cancion1");
        eventoGira.agregarTema("cancion2");
        eventoGira.agregarTema("cancion3");
        eventoGira.agregarTema("cancion4");
        
        System.out.println("El costo de la gira es: " + eventoGira.calcularCosto() + "\n");
        System.out.println(eventoGira.actuar());
        System.out.println(eventoGira.actuar());
        System.out.println(eventoGira.actuar());
        System.out.println(eventoGira.actuar());
        System.out.println(eventoGira.actuar());
        
    }
    
}
