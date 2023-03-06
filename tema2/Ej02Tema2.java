/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class Ej02Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dimF = 15;
        int dimL = 0;
        Persona [] vector = new Persona[dimF];
     
        String nombre;
        int dni;
        int edad = GeneradorAleatorio.generarInt(81);
        while ((dimL < 15) && (edad != 0)) {
            nombre = GeneradorAleatorio.generarString(10);
            dni = GeneradorAleatorio.generarInt(101);
            Persona P = new Persona();
            P.setNombre(nombre);
            P.setDNI(dni);
            P.setEdad(edad);
            
            vector[dimL] = P;
            dimL++;
            
            edad = GeneradorAleatorio.generarInt(81);
        }
        
        int cant = 0;
        for (int i = 0; i < dimL; i++) {
            System.out.println(i);
            System.out.println(vector[i].toString() + "\n");
            if (vector[i].getEdad() > 65) {
                cant++;
            }
        }
        System.out.println("Las personas mayores de 65 son: " + cant);

       int min = 999;
       int pos = -1;
       for (int i = 0; i < dimL; i++) {
           if (vector[i].getDNI() < min) {
               min = vector[i].getDNI();
               pos = i;
           }
       }
        System.out.println("La persona con menor dni es: " + vector[pos].toString());
    }
    
}
