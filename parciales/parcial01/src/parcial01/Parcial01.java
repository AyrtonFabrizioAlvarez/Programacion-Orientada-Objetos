/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial01;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class Parcial01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       
       Estante E = new Estante(5, 3);
       
        for (int i = 0; i < 7; i++) {
            Libro L = new Libro(Lector.leerString(), GeneradorAleatorio.generarString(6), GeneradorAleatorio.generarDouble(3));
            System.out.println("Ingrese el numero de estante donde quiere guardar el libro");
            int est = Lector.leerInt();
            System.out.println("Ingrese el numero de posicion donde quiere guardar el libro en el estante seleccionado");
            int pos = Lector.leerInt();
            E.agregarLibro(L, est, pos);
        }

       
       System.out.println("Libro a buscar");
       String tituloBuscado = Lector.leerString();
       Libro aux = E.sacarLibro(tituloBuscado);
       
        if (aux != null) {
            System.out.println("El libro " + tituloBuscado + " se encuentra en el estante");
        }
        else{
            System.out.println("El libro " + tituloBuscado + " no se encuentra en el estante");
        }
       
        System.out.println("El libro mas pesado es: " + E.calcular().getTitulo() + " con " + E.calcular().getPeso() + " de peso");
    }
    
}
