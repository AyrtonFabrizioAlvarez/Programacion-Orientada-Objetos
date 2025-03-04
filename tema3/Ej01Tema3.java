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
public class Ej01Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1 = GeneradorAleatorio.generarDouble(30);
        double lado2 = GeneradorAleatorio.generarDouble(30);
        double lado3 = GeneradorAleatorio.generarDouble(30);
        String colorRelleno = Lector.leerString();
        String colorLinea = Lector.leerString();
        Triangulo t1 = new Triangulo(lado1, lado2, lado3, colorRelleno, colorLinea);
        System.out.println(t1.getLado1());
        System.out.println(t1.getLado2());
        System.out.println(t1.getLado3());
        System.out.println(t1.getPerimetro());
        System.out.println(t1.getArea());
        
    }
}
