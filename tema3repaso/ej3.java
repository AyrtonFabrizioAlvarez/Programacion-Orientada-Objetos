/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estante E = new Estante(5);
        
        System.out.println("Ingrese el nombre del autor(condicion de corte)");
        String nombre = Lector.leerString();
        while (!nombre.equals("coco")) {
           //System.out.println("Ingrese su biografia");
           String biografia = GeneradorAleatorio.generarString(25);
           //System.out.println("Ingrese el origen del autor");
           String origen = GeneradorAleatorio.generarString(10);
           Autor A = new Autor(nombre, biografia, origen);
           
           System.out.println("Ingrese el titulo del Libro");
           String titulo = Lector.leerString();
           //System.out.println("Ingrese la editorial del Libro");
           String editorial = GeneradorAleatorio.generarString(8);
           //System.out.println("Ingrese el año de edicion");
           int año = GeneradorAleatorio.generarInt(73)+1950;
           //System.out.println("Ingrese el numero de ISBN");
           String isbn = GeneradorAleatorio.generarString(15);
           //System.out.println("Ingrese el precio del Libro");
           double precio = GeneradorAleatorio.generarDouble(5001);
           Libro L = new Libro(titulo, A, editorial, año, isbn, precio);
           
           E.agregarLibro(L);
           
           System.out.println("Ingrese el nombre del autor(condicion de corte)");
           nombre = Lector.leerString();
        }
        
        System.out.println(E.buscarTitulo("mujercitas").getPrimerAutor());
    }
    
}
