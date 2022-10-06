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
public class Ej01Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto P = new Proyecto ("Proyecto de Prueba", 1, "Coco Director");
        
        Investigador I1 = new Investigador("Coco", 1, "programacion");
        Investigador I2 = new Investigador("Ivo", 2, "Cyber-Seguridad");
        Investigador I3 = new Investigador("Rodri", 3, "Carpintero");
        
        Subsidio S1 = new Subsidio(100, "pobreza");
        Subsidio S2 = new Subsidio(150, "pobreza extrema");
        Subsidio S3 = new Subsidio(200, "mas que pobre amigo");
        Subsidio S4 = new Subsidio(250, "aiuda");
        
        
        I1.agregarSubsidio(S1);
        I1.agregarSubsidio(S2);
        I2.agregarSubsidio(S3);
        I2.agregarSubsidio(S4);
    
        
        P.agregarInvestigador(I1);
        P.agregarInvestigador(I2);
        P.agregarInvestigador(I3);
        

        System.out.println(P.toString());

        P.otorgarTodos("ivo");

        System.out.println(P.toString());


    }
    
}
