/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Herbert Schildt", "'inserte una biografia como la gente'", "Berisso");//INSTANCIO UN AUTOR1
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 autor1, "978-0071809252", 21.72);//PASO EL OBJETO AUTO1 COMO PARAMETRO AL CONSTRUCTOR LIBRO
        
        Autor autor2 = new Autor("John Horton", "'inserte una biografia como la gente'", "La Plata");//INSTANCIO UN AUTOR2
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               autor2, "978-1512108347");//PASO EL OBJETO AUTOR2 COMO PARAMETRO AL CONSTRUCTOR LIBRO
        System.out.println(libro1.toString() + "\n");
        System.out.println(libro2.toString() + "\n");
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        
        System.out.println(libro1.getPrimerAutor().toString());
        System.out.println(libro2.getPrimerAutor().toString());
        
        Libro libro3= new Libro(); 
    }
    
}
