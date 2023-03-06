/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Coco
 */
public class Ej05Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimF = 20;
        int dimL = 0;
        Partido [] vector = new Partido[dimF];
        
        System.out.println("Ingrese el nombre el equipo visitante");
        String visitante = Lector.leerString();
        
        while ( (dimL < dimF) && (!visitante.equals("zzz")) ) {
            System.out.println("Ingrese el nombre el equipo local");
            String local = Lector.leerString();
            int golesLocal = GeneradorAleatorio.generarInt(5);
            int golesVisitante = GeneradorAleatorio.generarInt(5);
            
            Partido P = new Partido(local, visitante, golesLocal, golesVisitante);
            vector[dimL] = P;
            dimL++;
            
            System.out.println("Ingrese el nombre el equipo visitante");
            visitante = Lector.leerString();
        }

        int cantRiver = 0;
        int cantBoca = 0;
        for (int i = 0; i < dimL; i++) {
            if (vector[i].getGanador().equals("river")) {
                cantRiver++;
            }
            if (vector[i].getLocal().equals("boca")) {
                cantBoca += vector[i].getGolesLocal();
            }
            System.out.println(i + "- " + vector[i].toString());
        }
        System.out.println("La cantidad de partidos que gano river son: " + cantRiver);
        System.out.println("La cantidadd e goles de local echos por boca son: " + cantBoca);
        
    }
    
}

/*Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.*/