/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej04Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int x = 5;
        int y = 8;
        Persona [][]casting = new Persona[x][y];
        
        int [] vectorDimL = new int[x];
        for (int i = 0; i < x; i++) {
            vectorDimL[i] = 0;
        }
        
        int fi = 0;
        int col = 0;
        boolean corte = false;
        
        while ( (fi < x) && (!corte) ) {
            col = 0;
            while  ( (col < y) && (!corte) ) {
                Persona P = new Persona();
                System.out.println("Ingrese un nombre (condicion de corte)");
                P.setNombre(Lector.leerString());//GeneradorAleatorio.generarString(6));
                P.setDNI(GeneradorAleatorio.generarInt(255)+38000000);
                P.setEdad(GeneradorAleatorio.generarInt(81));
                
                if (!P.getNombre().equals("zzz")){
                    casting[fi][col] = P;
                    col++;
                }
                else {
                    corte = true;
                }
           }
           vectorDimL[fi] = col;
           if (!corte) {
               fi++;
           }
        }
        
        System.out.println("filas " + fi + " columnas " + col);
        for (int i = 0; i < x; i++) {
            System.out.println("en la posicion " + i + " el vector(dimL) tiene " + vectorDimL[i] + " objetos");
        }
        
        for (int i = 0; i <= fi; i++) {
            System.out.println("Dia " + i);
            int pos = 0;
            int dimL = vectorDimL[i];
            while (pos != dimL) {
                System.out.println("Entrevista " + pos + ", Persona a entrevistar: " + casting[i][pos].getNombre());
                pos++;
            }
        }
    }
    
}

