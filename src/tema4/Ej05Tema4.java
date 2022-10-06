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
public class Ej05Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VisorFigurasModificado V = new VisorFigurasModificado();
        
        Cuadrado C1 = new Cuadrado(10, "negro", "amarillo");
        Rectangulo R1 = new Rectangulo(10, 5, "verde", "rojo");
        Cuadrado C2 = new Cuadrado(15, "rojo", "rosa");
        
        V.guardar(C1);
        V.guardar(C2);
        V.guardar(R1);
        
        V.mostrar();
        
    }
    
}
