/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4repaso;

/**
 *
 * @author Coco
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P = new Persona("Ivo", 36318865, 31);
        Trabajador T = new Trabajador("Ayrton", 38045251, 29, "Programador");
        
        System.out.println(P.toString() + "\n");
        System.out.println(T.toString());
        
    }
    
}
