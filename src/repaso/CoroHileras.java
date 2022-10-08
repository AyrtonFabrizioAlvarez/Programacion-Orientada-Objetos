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
public class CoroHileras extends Coro {
    private Corista [][] matrizCoristas;
    private int fila;
    private int columna;
    private int filaOcupada;
    private int columnaOcupada;

    public CoroHileras(int fila, int columna, String nombreCoro, int antiguedad, String nombre, int dni, int edad) {
        super(nombreCoro, antiguedad, nombre, dni, edad);
        this.matrizCoristas = new Corista[fila][columna];
        this.fila = fila;
        this.columna = columna;
        this.filaOcupada = 0;
        this.columnaOcupada = 0;
    }
    
    //GETTERS

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    //SETTERS

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
        //ABSTRACTOS
    public void agregarCorista(Corista C){
        if (this.filaOcupada < this.fila) {
            this.matrizCoristas[this.filaOcupada][this.columnaOcupada] = C;
            columnaOcupada++;
            if (columnaOcupada == this.columna) {
                columnaOcupada = 0;
                filaOcupada++;
            }
        }
        else{
            System.out.println("La matriz esta llena");
        }
    }
    
    public boolean coroLleno(){
        return ( (filaOcupada == fila) );
    }
    
    public boolean ordenCoro(){
        int posFil = 0;
        int posCol = 0;
        while (posFil < this.fila){
            while (posCol < this.columna-1) {
                if (this.matrizCoristas[posFil][posCol].getTono() != this.matrizCoristas[posFil][posCol+1].getTono()){
                    return false;
                }
                posCol++;
            }
                posFil++;
                posCol = 0;
        }
        posFil = 0;
        while (posFil < this.fila-1) {
            if (this.matrizCoristas[posFil][0].getTono() < this.matrizCoristas[posFil+1][0].getTono()) {
                return false;
            }
            posFil++;
        }
        return true;
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.filaOcupada; i++) {
            for (int j = 0; j < this.columna; j++) {
                msj = msj + this.matrizCoristas[i][j].toString();
            }
        }
        return super.toString() + msj;
    }
}
