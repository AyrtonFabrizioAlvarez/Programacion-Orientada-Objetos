/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej01Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("Ingrese su Nombre");
       String nombre = Lector.leerString();

       System.out.println("Ingrese su Dni");
       int dni = Lector.leerInt();
       
       System.out.println("Ingrese su Edad");
       int edad = Lector.leerInt();

       Persona P = new Persona();
       P.setNombre(nombre);
       P.setDNI(dni);
       P.setEdad(edad);
       
       
       System.out.println(P.toString());
    }
    
}
