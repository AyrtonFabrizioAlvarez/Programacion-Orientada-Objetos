/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialobjetos.superclase;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class ParcialObjetosSuperClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SubsidioEstadia SE = new SubsidioEstadia(GeneradorAleatorio.generarString(10), GeneradorAleatorio.generarDouble(1000),
                                                 GeneradorAleatorio.generarInt(10), GeneradorAleatorio.generarDouble(100),
                                                 GeneradorAleatorio.generarString(6), GeneradorAleatorio.generarString(20),
                                                 GeneradorAleatorio.generarString(3));
        
        SubsidioBienes SB = new SubsidioBienes(5, GeneradorAleatorio.generarString(6), GeneradorAleatorio.generarString(20), GeneradorAleatorio.generarString(3));
        
        for (int i = 0; i < 4; i++) {
            String descripcion = GeneradorAleatorio.generarString(10);
            int cantidad = GeneradorAleatorio.generarInt(10);
            double costo = GeneradorAleatorio.generarDouble(100);
            Bien B = new Bien(descripcion, cantidad, costo);
            SB.agregarBien(B);
        }
        
        //System.out.println(SE.toString());
        System.out.println(SB.toString());
    }
}
