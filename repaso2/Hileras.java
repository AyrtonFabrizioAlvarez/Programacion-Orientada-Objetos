/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

/**
 *
 * @author Coco
 */
public class Hileras extends Coro{
    private Corista [][] matrizCoro;
    private int filas;
    private int columnas;
    
    public Hileras(String unNombre, Director D, int cantFilas, int cantColumnas){
        super(unNombre, D);
        this.filas = cantFilas;
        this.columnas = cantColumnas;
        this.matrizCoro = new Corista[this.filas][this.columnas];
    }
    
    //SETTERS
    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    //GETTERS
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    //OTROS
    public void agregarCorista(Corista C){
        int x = 0;
        int y = 0;
        boolean agregue = false;
        while ( (x < this.getFilas()) && (!agregue) ) {
            y = 0;
            while ( (y < this.getColumnas()) && (!agregue) ) {
                if (this.matrizCoro[x][y] == null) {
                    this.matrizCoro[x][y] = C;
                    agregue = true;
                }
                if (!agregue) {
                    y++;
                }
            }
            if (!agregue) {
                x++;
            }
        }
    }
    
    public boolean isLleno(){
        boolean lleno = true;
        int x = 0;
        int y;
        while ( (x < this.getFilas()) && (lleno) ) {
            y = 0;
            while ( (y < this.getColumnas()) && (lleno) ) {
                if (this.matrizCoro[x][y] == null) {
                    lleno = false;
                }
                y++;
            }
            x++;
        }
        return lleno;
    }
    
    public boolean isOrdenado(){
        boolean ordenado = true;
        int x = 0;
        int y;
        while ((x < this.getFilas()-1) && (ordenado) ) {
            y = 0;
            while ( (y < this.getColumnas()-1) && (ordenado) ) {
                if (this.matrizCoro[x][y].getTono() != this.matrizCoro[x][(y+1)].getTono()) {
                    ordenado = false;
                }
                else if (this.matrizCoro[x][y].getTono() <= this.matrizCoro[(x+1)][y].getTono()) {
                    ordenado = false;
                }
                y++;
            }
            x++;
        }
        return ordenado;
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.getFilas(); i++) {
            for (int j = 0; j < this.getColumnas(); j++) {
                if (this.matrizCoro[i][j] != null) {
                    msj += this.matrizCoro[i][j].toString();
                }
            }
        }
        return msj;
    }
    
    
}
