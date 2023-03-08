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
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo C1 = new Circulo("azul", "amarillo", 2.5);
        System.out.println(C1.toString() + "\n");
        Cuadrado C2 = new Cuadrado("verde", "rojo", 2.5);
        System.out.println(C2.toString() + "\n");
        Triangulo T = new Triangulo("violeta", "rosa", 3.0, 4.5, 6.0);
        System.out.println(T.toString() + "\n");
        
        T.despintar();
        System.out.println(T.toString() + "\n");
        
    }
    
}
