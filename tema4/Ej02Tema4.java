/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Coco
 */
public class Ej02Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador J = new Jugador(10, 10, "cocoJ", 1000, 28);
        System.out.println(J.toString());
        
        Entrenador E = new Entrenador(11, "cocoE", 1000, 1);
        System.out.println(E.toString());
    }
    
}
