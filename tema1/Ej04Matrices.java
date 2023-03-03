/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej04Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        
        int piso = Lector.leerInt();
        int oficina = GeneradorAleatorio.generarInt(4)+1;
        int [][] matriz = new int[8][4];
        while (piso != 9)  {
            matriz[piso-1][oficina-1] = matriz[piso-1][oficina-1] + 1;
            piso = Lector.leerInt();
            oficina = GeneradorAleatorio.generarInt(4)+1;
        }
        
        for (int k = 0; k < 8; k++) {
            System.out.println("Piso " + (k+1));
            for (int l = 0; l < 4; l++) {
                System.out.print("Oficina " + (l+1) + " [" + matriz[k][l] + "]");
            }
            System.out.println("\n");
        }
        

        
    }
    
}

