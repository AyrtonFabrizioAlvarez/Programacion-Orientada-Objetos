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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Corista C1 = new Corista("corista1", 111111, 26, 5);
        Corista C2 = new Corista("corista2", 222222, 26, 1);
        Corista C3 = new Corista("corista3", 333333, 26, 3);
        Corista C4 = new Corista("corista4", 444444, 26, 2);
        Corista C5 = new Corista("corista5", 555555, 26, 1);
        
        Director D1 = new Director("director1", 666666, 45, 4);
        
        Semicircular coroSemicircular = new Semicircular("CoroSemicircular", D1, 5);
        
        coroSemicircular.agregarCorista(C1);
        coroSemicircular.agregarCorista(C2);
        coroSemicircular.agregarCorista(C3);
        coroSemicircular.agregarCorista(C4);
        coroSemicircular.agregarCorista(C5);
        
        System.out.println("Coro Semicircular lleno? " + coroSemicircular.isLleno());
        System.out.println("Coro Semicircular en orden? " + coroSemicircular.isOrdenado());
        System.out.println(coroSemicircular.toString());*/
        
        Corista C1 = new Corista("corista1", 111111, 26, 3);
        Corista C2 = new Corista("corista2", 222222, 26, 3);
        Corista C3 = new Corista("corista3", 333333, 26, 3);
        Corista C4 = new Corista("corista4", 444444, 26, 2);
        Corista C5 = new Corista("corista5", 555555, 26, 2);
        Corista C6 = new Corista("corista6", 666666, 26, 2);
        Corista C7 = new Corista("corista7", 777777, 26, 1);
        Corista C8 = new Corista("corista8", 888888, 26, 1);
        Corista C9 = new Corista("corista9", 999999, 26, 1);
        
        Director D2 = new Director("director2", 666666, 45, 4);
        
        Hileras coroHileras = new Hileras("CoroHileras", D2, 3, 3);
        
        coroHileras.agregarCorista(C1);
        coroHileras.agregarCorista(C2);
        coroHileras.agregarCorista(C3);
        coroHileras.agregarCorista(C4);
        coroHileras.agregarCorista(C5);
        coroHileras.agregarCorista(C6);
        coroHileras.agregarCorista(C7);
        coroHileras.agregarCorista(C8);
        coroHileras.agregarCorista(C9);
        
        
        System.out.println("Coro Semicircular lleno? " + coroHileras.isLleno());
        System.out.println("Coro Semicircular en orden? " + coroHileras.isOrdenado());
        //System.out.println(coroHileras.toString());
    }
    
}
