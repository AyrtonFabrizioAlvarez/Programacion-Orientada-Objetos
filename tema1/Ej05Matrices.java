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
        GeneradorAleatorio.iniciar();
        int[][] puntaje = new int[5][4];
        int atencion, calidad, precio, ambiente;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                puntaje[i][j] = GeneradorAleatorio.generarInt(10)+1;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + puntaje[i][j] + "] ");
            }
            System.out.println("\n");
        }
        
        double x = 0;
        double promedio = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                x = x + puntaje[j][i];
            }
            promedio = x/5;
            System.out.println("Aspecto " + (i+1) + ": " + promedio);
        }
    }
    
}

