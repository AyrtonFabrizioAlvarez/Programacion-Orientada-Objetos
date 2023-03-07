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
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Herbert Schildt", "'inserte una biografia como la gente'", "Berisso");//INSTANCIO UN AUTOR1
        Libro libro1= new  Libro( "Java: A Beginner's Guide", autor1,   
                                 "Mcgraw-Hill", 2014, "978-0071809252", 21.72);//PASO EL OBJETO AUTO1 COMO PARAMETRO AL CONSTRUCTOR LIBRO
        
        Autor autor2 = new Autor("John Horton", "'inserte una biografia como la gente'", "La Plata");//INSTANCIO UN AUTOR2
        Libro libro2= new Libro("Learning Java by Building Android Games", autor2,  
                              "CreateSpace Independent Publishing", 2015, "978-1512108347", 15.75);//PASO EL OBJETO AUTOR2 COMO PARAMETRO AL CONSTRUCTOR LIBRO
        System.out.println(libro1.toString() + "\n");
        System.out.println(libro2.toString() + "\n");

        
        System.out.println(libro1.getPrimerAutor().toString() + "\n");
        System.out.println(libro2.getPrimerAutor().toString());
        
    }
    
}
