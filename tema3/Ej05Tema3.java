/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej05Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el radio del circulo a instanciar");
        double radio = Lector.leerDouble();
        System.out.println("Ingrese el color de relleno del circulo a instanciar");
        String colorRelleno = Lector.leerString();
        System.out.println("Ingrese el color de linea del circulo a instanciar");
        String colorLinea = Lector.leerString();
        Circulo unCirculo = new Circulo(radio, colorRelleno, colorLinea);
        
        System.out.println("El perimetro del circulo con radio " + (int)unCirculo.getRadio() + " es: " + unCirculo.calcularPerimetro());
        System.out.println("El area del circulo con radio " + (int)unCirculo.getRadio() + " es: " + unCirculo.calcularArea());
    }
    
}
