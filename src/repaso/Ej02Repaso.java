/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej02Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento E = new Estacionamiento("Coco's", "Cocolandia", 08.00, 21.00, 3, 3);
        
        Auto A1 = new Auto("coco", "patente1");
        Auto A2 = new Auto("ivan", "patente2");
        Auto A3 = new Auto("joaquin", "patente3");
        Auto A4 = new Auto("churrasquito", "patente4");
        Auto A5 = new Auto("ricardito", "patente5");
        Auto A6 = new Auto("felipe", "patente6");
        
        E.registrarAuto(A1, 1, 2);
        E.registrarAuto(A2, 2, 2);
        E.registrarAuto(A3, 2, 3);
        E.registrarAuto(A4, 3, 1);
        E.registrarAuto(A5, 3, 2);
        E.registrarAuto(A6, 1, 1);
        
        System.out.println(E.contarAutosPorPlaza(2));
        
        //String patenteBuscada = Lector.leerString();
        System.out.println(E.buscarPosicionAuto("patente1"));
        
        System.out.println(E.toString());
    }
    
}
