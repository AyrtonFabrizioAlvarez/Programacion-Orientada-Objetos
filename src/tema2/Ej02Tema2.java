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
        
         int edad = GeneradorAleatorio.generarInt(81);
         while ( (edad != 0) && (dimL < dimF) ) {
            Persona P = new Persona();
            P.setEdad(edad);
            P.setNombre(GeneradorAleatorio.generarString(6));
            P.setDNI(GeneradorAleatorio.generarInt(200));
            vector[dimL] = P;

            dimL++;
            
            edad = GeneradorAleatorio.generarInt(81);
        }

         
         int cant = 0;
         for (int i = 0; i < dimL; i++) {
             System.out.println(vector[i].toString());
             if (vector[i].getEdad() > 65) {
                cant = cant + 1; 
             }
        }
         System.out.println("La cantidad de personas mayores de 65 años son: " + cant);
         
         int min = 999;
         int pos = 0;
         for (int i = 0; i < dimL; i++) {
            if (vector[i].getDNI() < min) {
                min = vector[i].getDNI();
                pos = i;
            }
        }
         System.out.println(vector[pos]);
    }
    
}
