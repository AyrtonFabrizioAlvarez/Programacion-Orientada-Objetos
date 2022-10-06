/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class Ej05Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntajes [][];
        int x = 5, y = 4;
        puntajes = new int[x][y];
        
        int atencion, calidad, precio, ambiente;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               puntajes[i][j] =  GeneradorAleatorio.generarInt(10) + 1;
            }    
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(puntajes[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        double [] promedios = new double[y];
        double total = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                total = total + puntajes[j][i];
            }
            promedios[i] = total / 5;
            total = 0;
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("aspecto " + i + " promedio: " + promedios[i]);
        }
    }
    
}

