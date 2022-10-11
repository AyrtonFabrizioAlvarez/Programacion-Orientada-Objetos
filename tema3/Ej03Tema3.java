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
public class Ej03Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimF = 20;         // PASO POR PARAMETRO LA DIMF QEU TRNDRA EL VECTOR

        Estante E = new Estante(dimF);  //INSTANCIO MI OBJETO "E" DE LA CLASE ESTANTE (ACA MISMO SE INSTANCIA CADA OBJ )
        
        System.out.println("Ingrese el nombre del autor(condicion de corte)");
        String nombre = Lector.leerString();
        while ( (!nombre.equalsIgnoreCase("coco")) && (E.getCantLibros()< dimF) ) {
           String biografia = GeneradorAleatorio.generarString(15);
           String origen = GeneradorAleatorio.generarString(7);
           Autor A = new Autor(nombre, biografia, origen);//INSTANCIE Y CREÉ MI OBJ A DEL TIPO AUTOR
           
           System.out.println("Ingrese el titulo del libro(para futura busqueda)");
           String titulo = Lector.leerString();
           String editorial = GeneradorAleatorio.generarString(10);
           String isbn = GeneradorAleatorio.generarString(20);
           Libro L = new Libro(titulo, editorial, A, isbn);// INSTANCIE Y CREÉ MI OBJ L DEL TIPO LIBRE
           
           E.addLibro(L);//ENVIO MI OBJ L(LIBRO) A MI YA INSTANCIADO OBJ E(ESTANTE)
           
           System.out.println("Ingrese el nombre del autor(condicion de corte)");
           nombre = Lector.leerString();//VUELVO A LEER UN NOMBRE DE AUTOR PARA LA CONDICION DE CORTE
        }
        Libro buscado = E.getLibroPorTitulo("mujercitas");//UTILIZO EL METODO GETLIBROPORTITULO EL CUAL DEVUELVE TRUE SI EXISTE O NULL SI NO EXISTE.
        if (buscado != null) {
            System.out.println("El autor del libro Mujercitas es: " + buscado.getPrimerAutor().getNombre());
        }
        else{
            System.out.println("No hay ningun libro con el titulo 'Mujercitas'");
        }
       
    }
}

/*3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
*/
