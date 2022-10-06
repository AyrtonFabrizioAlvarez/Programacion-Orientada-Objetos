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
        
       Persona p1 = new Persona();
       String nombre;
       int dni, edad;
       
       System.out.println("Ingrese su Nombre");
       nombre = Lector.leerString();
       p1.setNombre(nombre);
       
       System.out.println("Ingrese su dni");
       dni = Lector.leerInt();
       p1.setDNI(dni);
       
       System.out.println("Ingrese su edad");
       edad = Lector.leerInt();
       p1.setEdad(edad);
       
       System.out.println(p1.toString());
       
        
    }
    
}
