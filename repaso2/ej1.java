/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Coco
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto P = new Proyecto("Prueba 1", 123, "Ayrton Alvarez");
        Investigador I1 = new Investigador("Churri", 1, "Comer");
        P.agregarInvectigador(I1);
        Investigador I2 = new Investigador("Richi", 2, "Chusmear");
        P.agregarInvectigador(I2);
        Investigador I3 = new Investigador("Belu", 3, "Cokearse");
        P.agregarInvectigador(I3);
        
        Subsidio S1 = new Subsidio(1000, "insumos");
        I1.agregarSubsidio(S1);
        Subsidio S2 = new Subsidio(1000, "insumos");
        I1.agregarSubsidio(S2);
        
        Subsidio S3 = new Subsidio(1000, "insumos");
        I2.agregarSubsidio(S3);
        Subsidio S4 = new Subsidio(1000, "insumos");
        I2.agregarSubsidio(S4);
        
        Subsidio S5 = new Subsidio(1000, "insumos");
        I3.agregarSubsidio(S5);
        Subsidio S6 = new Subsidio(1000, "insumos");
        I3.agregarSubsidio(S6);
        
        P.otorgarTodos("Churri");
        System.out.println(P.toString());
        
    }
    
}
