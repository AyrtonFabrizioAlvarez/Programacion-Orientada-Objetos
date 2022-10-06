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
public class Ej03Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P = new Persona("cocoP", 38045251, 28);
        System.out.println(P.toString());
        
        Trabajador T = new Trabajador("Programador", "cocoT", 38045251, 28);
        System.out.println(T.toString());
    }
    
}
