
package tema1;
import PaqueteLectura.Lector;
//Paso 1: Importar la funcionalidad para lectura de datos


public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double [] vector;
        
        //Paso 3: Crear el v,ector para 15 double 
        vector = new double[15];
        
        //Paso 4: Declarar indice y variables auxiliares a usar
        double total, promedio;
        int mayorPromedio;
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (int i = 0; i < 15; i++) {
            vector[i] = Lector.leerDouble();
        }
        
        //Paso 7: Calcular el promedio de alturas, informarlo
        total = 0;
        for (int i = 0; i < 15; i++) {
            total = total + vector[i];
        }
        promedio = total / 15;
        System.out.println(promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        mayorPromedio = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] > promedio) {
                mayorPromedio = mayorPromedio + 1;
            }
        }
        
        //Paso 9: Informar la cantidad.
        System.out.println("La cantidad de alturas que superan el promedio son; " + mayorPromedio);
    }
    
}
