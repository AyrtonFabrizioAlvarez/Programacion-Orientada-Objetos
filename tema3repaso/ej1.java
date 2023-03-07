/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        System.out.println("Ingrese el lado 1");
        int lado1 = Lector.leerInt();
        System.out.println("Ingrese el lado 2");
        int lado2 = Lector.leerInt();
        System.out.println("Ingrese el lado 3");
        int lado3 = Lector.leerInt();
        System.out.println("Ingrese el color de Relleno");
        String colR = Lector.leerString();
        System.out.println("Ingrese el color de Linea");
        String colL = Lector.leerString();
        
        Triangulo T = new Triangulo(lado1, lado2, lado3, colR, colL);
        
        System.out.println("El perimetro es: " + T.calcularPerimetro());
        System.out.println("El area es: " + T.calcularArea());

        
    }
    
}
