
package tema1;
//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double [] vector;
        int dimF = 15;
        
        //Paso 3: Crear el v,ector para 15 double 
        vector = new double [dimF];
        
        //Paso 4: Declarar indice y variables auxiliares a usar
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (int i = 0; i < dimF; i++) {
            vector[i] = GeneradorAleatorio.generarDouble(3);
            System.out.println(i + "- " + vector[i]);
        }
        
        //Paso 7: Calcular el promedio de alturas, informarlo
        double promedio = 0.0;
        for (int j = 0; j < dimF; j++) {
            promedio =  promedio +vector[j];
        }
        promedio = promedio / dimF;
        System.out.println("Promedio de alturas: " + promedio);
        
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        int x = 0;
        for (int k = 0; k < dimF; k++) {
            if (vector[k] > promedio) {
                x = x + 1;
            }
        }
        
        
        //Paso 9: Informar la cantidad.
        System.out.println("Cantidad de alturas por encima del promedio: " + x);
    }   
    
}
