/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;

/**
 *
 * @author Coco
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo C = new Circulo(2.5, "rojo", "amarillo");
        
        System.out.println("El perimetro del circulo es: " + C.calcularPerimetro() + "\n");
        System.out.println("El area del circulo es: " + C.calcularArea());
    }
    
}
