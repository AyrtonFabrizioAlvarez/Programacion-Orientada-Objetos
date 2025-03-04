/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

/**
 *
 * @author Coco
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento E = new Estacionamiento("Estacionamiento1", "Calle1", "8.00", "17.00", 3, 3);
        Auto A1 = new Auto("Coco1", "a1");
        E.registrarAuto(A1, 0, 0);
        Auto A2 = new Auto("Coco2", "a2");
        E.registrarAuto(A2, 0, 1);
        Auto A3 = new Auto("Coco3", "a3");
        E.registrarAuto(A3, 1, 1);
        Auto A4 = new Auto("Coco4", "a4");
        E.registrarAuto(A4, 1, 2);
        Auto A5 = new Auto("Coco5", "a5");
        E.registrarAuto(A5, 2, 0);
        Auto A6 = new Auto("Coco6", "a6");
        E.registrarAuto(A6, 2, 1);
        
        System.out.println(E.toString());
        System.out.println("La cantidad de autos en la plaza 1 es: " + E.contarPlaza(1));
        System.out.println(E.ubicarAuto("a6"));
    }
    
}
