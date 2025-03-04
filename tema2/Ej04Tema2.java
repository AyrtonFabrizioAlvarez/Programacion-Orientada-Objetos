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
        Persona [][] matriz = new Persona[x][y];
        
        String nombre;
        int edad, dni;
        int fil = 0;
        int col;
        
        nombre = Lector.leerString();
        
        while ( (fil < 5) && (!nombre.equals("zzz")) ) {
            col = 0;
            while ( (col < 8) && (!nombre.equals("zzz")) ) {
                edad = GeneradorAleatorio.generarInt(81);
                dni = GeneradorAleatorio.generarInt(101);
                
                Persona P = new Persona();
                P.setNombre(nombre);
                P.setDNI(dni);
                P.setEdad(edad);
                
                matriz[fil][col] = P;
                col++;
                nombre = Lector.leerString();
            }
            fil++;
        }
        
        for (int i = 0; i < 5; i++) {
            if (matriz[i][0] != null) {
                System.out.println("Dia: " + (i+1) + "\n");
            }
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] != null) {
                    System.out.println("Turno " + (j+1) + "\n" + matriz[i][j].toString() + "\n");
                }
            }
        }
    }
}

