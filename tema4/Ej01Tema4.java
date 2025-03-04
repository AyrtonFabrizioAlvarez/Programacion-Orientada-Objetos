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
public class Ej01Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo T = new Triangulo(11, 23, 17, "verde", "amarillo");
        System.out.println("Representacion del triangulo: " + T.toString());
        
        Circulo C = new Circulo(10, "rojo", "amarillo");
        System.out.println("Representacion del circulo: " + C.toString());
        
        T.despintar();
        System.out.println("Representacion del triangulo: " + T.toString());
       
        C.despintar();
        System.out.println("Representacion del circulo: " + C.toString());
    }
    
}
