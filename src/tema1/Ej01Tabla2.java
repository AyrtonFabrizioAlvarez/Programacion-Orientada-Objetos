
package tema1;
import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {
    /**
     * Carga un vector que representa la tabla del 2
     * @param args
     */
    public static void main(String[] args) {
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++)
            tabla2[i]=2*i;
        System.out.println("2x" + "6" + "="+ tabla2[6]);
        
        int j = GeneradorAleatorio.generarInt(12);
        while (j != 11){
            System.out.println("2 x " + j + " = " +tabla2[j]);
            j= GeneradorAleatorio.generarInt(12);
            if (j == 11) {
                System.out.println("j ahora es igual a 11");
            }
        }
    }   
}
