/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4repaso;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador J = new Jugador("Ayrton", 1000, 5, 2, 1);
        Entrenador E = new Entrenador("Ivo", 1000, 1, 0);
        System.out.println(E.toString());
    }
    
}
