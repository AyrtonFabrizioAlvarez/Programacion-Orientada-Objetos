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
        Partido [] campeonato = new Partido[dimF];
        
        System.out.println("Ingrese el equipo visitante (condicion de corte)");
        String visitante = Lector.leerString();

        while ((!visitante.equalsIgnoreCase("ZZZ")) && (dimL<dimF) ) {
            
            System.out.println("Ingrese el equipo local");
            String local = Lector.leerString();//(GeneradorAleatorio.generarString(6));
            int golesLocal = GeneradorAleatorio.generarInt(3);
            int golesVisitante = GeneradorAleatorio.generarInt(3);
            Partido P = new Partido(local, visitante, golesLocal, golesVisitante);
            
            campeonato[dimL] = P;
            dimL++;
            
            System.out.println("Ingrese el equipo visitante (condicion de corte)");
            visitante = Lector.leerString();
        }
        
        int cant = 0;
        int goles = 0;
        for (int i = 0; i < dimL; i++) {
            System.out.println("---Fecha " + i + "---");
            System.out.println(campeonato[i].toString());
            if (campeonato[i].getLocal().equalsIgnoreCase("boca")) {
                goles = goles + campeonato[i].getGolesLocal();
            }
            if (campeonato[i].getGanador().equalsIgnoreCase("river")) {
                cant++;
            }
        }
        System.out.println("La cantidad de partidos ganados por river son: " + cant);
        System.out.println("La cantidad de goles que tiene boca de local son: " + goles);
        
        
    }
    
}

/*Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.*/