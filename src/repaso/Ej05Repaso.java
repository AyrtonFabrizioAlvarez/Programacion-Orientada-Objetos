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
public class Ej05Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*CoroSemiCircular circular = new CoroSemiCircular(4, "CoroCircular", 2, "coco", 38045251, 28);
        Corista c1 = new Corista(4, "coristaSC1", 38046578, 23);
        Corista c2 = new Corista(2, "coristaSC2", 24756985, 35);
        Corista c3 = new Corista(2, "coristaSC3", 40234567, 18);
        Corista c4 = new Corista(1, "coristaSC4", 33456764, 20);
        circular.agregarCorista(c1);
        circular.agregarCorista(c2);
        circular.agregarCorista(c3);
        circular.agregarCorista(c4);
        
        System.out.println(circular.toString());
        System.out.println(circular.ordenCoro());*/
        
        CoroHileras hileras = new CoroHileras(3, 3, "CoroHileras", 1, "ivo", 36318865, 30);
        Corista c11 = new Corista(4, "coristaH1", 11111111, 19);
        Corista c12 = new Corista(4, "coristaH2", 22222222, 32);
        Corista c13 = new Corista(4, "coristaH3", 33333333, 33);
        Corista c14 = new Corista(3, "coristaH4", 44444444, 27);
        Corista c15 = new Corista(3, "coristaH5", 55555555, 24);
        Corista c16 = new Corista(3, "coristaH6", 66666666, 25);
        Corista c17 = new Corista(1, "coristaH7", 77777777, 21);
        Corista c18 = new Corista(1, "coristaH8", 88888888, 24);
        Corista c19 = new Corista(1, "coristaH9", 99999999, 28);
        hileras.agregarCorista(c11);
        hileras.agregarCorista(c12);
        hileras.agregarCorista(c13);
        hileras.agregarCorista(c14);
        hileras.agregarCorista(c15);
        hileras.agregarCorista(c16);
        hileras.agregarCorista(c17);
        hileras.agregarCorista(c18);
        hileras.agregarCorista(c19);

        
        System.out.println(hileras.toString());
        System.out.println(hileras.coroLleno());
        System.out.println(hileras.ordenCoro());
        
        

    
}
