/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
//Paso 1. importar la funcionalidad para generar datos aleatorios

public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int matriz [][];
        matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = GeneradorAleatorio.generarInt(30);
            }
        }
        //Paso 4. mostrar el contenido de la matriz en consola
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int sumaFila = 0;
        for (int i = 0; i < 5; i++) {
            sumaFila = sumaFila + matriz[1][i];       
        }
        System.out.println("La suma de los elementos de la fila 1 es: " + sumaFila);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int [] vectorSuma = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                vectorSuma[j] = vectorSuma[j] + matriz[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("La suma de la columna " + i + " es: " + vectorSuma[i]);
        }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        int num = Lector.leerInt();
        int f = 0;
        int c = 0;
        boolean ok = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == num) {
                    ok = true;
                    f = i;
                    c = j;
                }
            }
        }
        if (ok) {
            System.out.println("El elemento se encuentra en la posicion " + f + " , " + c + " de la amtriz");
        }
        else {
            System.out.println("El elemento no se encuentra en la matriz");
        }
    }
}
