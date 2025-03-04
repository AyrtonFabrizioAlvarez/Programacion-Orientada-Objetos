/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaobjetos.matriz;

/**
 *
 * @author Coco
 */
public class Estanteria {
    private Libro [][] matrizLibros;
    private int filas;
    private int columnas;

    public Estanteria(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matrizLibros = new Libro[this.filas][this.columnas];
    }
    
    //GETTERS

    public Libro[][] getMatrizLibros() {
        return matrizLibros;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    //SETTERS

    public void setMatrizLibros(Libro[][] matrizLibros) {
        this.matrizLibros = matrizLibros;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    //OTROS METODOS
    
    public void almacenarLibro(Libro L, int estante){
        int posCol = 0;
        boolean pude = false;
        while ( (posCol < this.columnas) && (!pude) ) {
            if (this.matrizLibros[estante][posCol] == null) {
                this.matrizLibros[estante][posCol] = L;
                pude = true;
            }
            posCol++;
        }
    }
    
    public Libro sacarLibro(int x, int y){
        Libro aux = this.matrizLibros[x][y];
        this.matrizLibros[x][y] = null;
        return aux;
    }
    
    public int calcular(){
        int posFil = 0;
        int posCol = 0;
        double max = -1;
        int maxEstante = 0;
        double contador = 0;
        while (posFil < this.filas) {
            while (posCol < this.columnas) {
                if (this.matrizLibros[posFil][posCol] != null) {
                    contador += this.matrizLibros[posFil][posCol].getPeso();
                } 
                System.out.println(contador);
                posCol++;
            }
            if (contador > max) {
                max = contador;
                maxEstante = posFil;
            }
            contador = 0;
            posCol = 0;
            posFil++;
        }
        return maxEstante;
    }
}
