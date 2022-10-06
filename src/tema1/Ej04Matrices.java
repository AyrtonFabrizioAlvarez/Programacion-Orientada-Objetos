/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
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
        
        int edificio [][];
        edificio = new int[8][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                edificio[i][j] = 0;
            }
        }
        
        int piso,oficina;
        piso = Lector.leerInt();
        while (piso != 9){
            oficina = GeneradorAleatorio.generarInt(4);//Lector.leerInt();
            edificio[piso][oficina] = edificio[piso][oficina] + 1;
            piso = Lector.leerInt();
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("En el piso " + i + " en la oficina " + j + " asistieron " + edificio[i][j] + " personas");
            }
        }
        
    }
    
}

