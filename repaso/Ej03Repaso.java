/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Coco
 */
public class Ej03Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gira G = new Gira("Gira Prueba", 10, "Coco's band", 10);
        
        Fecha F1 = new Fecha("berisso", "01/03/1994");
        G.agregarFecha(F1);
        G.agregarTema("cancion1");
        G.agregarTema("cancion2");
        G.agregarTema("cancion3");
        
        Fecha F2 = new Fecha("la plata", "01/04/1994");
        G.agregarFecha(F2);
        G.agregarTema("cancion4");
        G.agregarTema("cancion5");
        G.agregarTema("cancion6");
        
        Fecha F3 = new Fecha("los talas", "01/05/1994");
        G.agregarFecha(F3);
        G.agregarTema("cancion7");
        G.agregarTema("cancion8");
        
        Fecha F4 = new Fecha("ensenada", "01/06/1994");
        G.agregarFecha(F4);
        G.agregarTema("cancion9");
        
        Evento E = new Evento("show de tv", "Coco contratista", "01/02/1994", "Coco's band 2", 5);
        E.agregarTema("cancion00");
        E.agregarTema("cancion01");
        E.agregarTema("cancion02");
        E.agregarTema("cancion03");
        E.agregarTema("cancion04");
        E.agregarTema("cancion04");
        
        
        
        System.out.println("Costo de la gira: " + G.calcularCosto());
        System.out.println("Costo del evento: " + E.calcularCosto());
        
        System.out.println(G.actuar());
        System.out.println(E.actuar());
        
        
    }
    
}
