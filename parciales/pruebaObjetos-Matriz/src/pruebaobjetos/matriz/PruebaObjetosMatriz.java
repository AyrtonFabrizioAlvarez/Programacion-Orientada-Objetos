/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaobjetos.matriz;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class PruebaObjetosMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estanteria E = new Estanteria(5, 3);
        
        for (int i = 0; i < 7; i++) {
            String titulo = GeneradorAleatorio.generarString(10);
            String nombre = GeneradorAleatorio.generarString(6);
            System.out.println("Ingrese el peso");
            double peso = Lector.leerDouble();
            Libro L = new Libro(titulo, nombre, peso);
            System.out.println("Ingrese el numero de estante donde desea guardar el libro");
            int estante = Lector.leerInt();
            E.almacenarLibro(L, estante);
        }
        

        E.sacarLibro(0, 1);
        System.out.println("El estante mas pesado es: " + E.calcular());

    }
    
}
