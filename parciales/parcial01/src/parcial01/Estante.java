/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial01;

/**
 *
 * @author Coco
 */
public class Estante {
    private Libro [][] matrizLibros;
    private int estantes;
    private int libros;
    
    public Estante (int cantEstantes, int cantLibros){
        this.estantes = cantEstantes;
        this.libros = cantLibros;
        matrizLibros = new Libro[this.estantes][this.libros];
    }
    
    //GETTERS

    public int getEstantes() {
        return estantes;
    }

    public int getLibros() {
        return libros;
    }
    
    //SETTERS

    public void setEstantes(int estantes) {
        this.estantes = estantes;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }
    
    //OTROS METODOS
    public void agregarLibro(Libro L, int nEstante, int nLibro){
        this.matrizLibros[nEstante][nLibro] = L;
    }
    
    public Libro sacarLibro(String tituloBuscado){
        int posFil = 0;
        int posCol;
        Libro aux = null;
        boolean encontre = false;
        while ( (posFil < this.estantes) && (!encontre) ) {
            posCol = 0;
            while ( (posCol < this.libros) && (!encontre) ) {
                if ( (this.matrizLibros[posFil][posCol] != null) && (this.matrizLibros[posFil][posCol].getTitulo().equalsIgnoreCase(tituloBuscado)) ) {
                    encontre = true;
                    aux = this.matrizLibros[posFil][posCol];
                    this.matrizLibros[posFil][posCol] = null;
                }
                else{
                    posCol++;
                }
            }
            if (!encontre) {
                posFil++;
            }
        }
        return aux;        
    }
    
    public Libro calcular(){
        double max = -1;
        Libro aux = null;
        for (int i = 0; i < this.estantes; i++) {
            for (int j = 0; j < this.libros; j++) {
                if ( (this.matrizLibros[i][j] != null) && (this.matrizLibros[i][j].getPeso() > max) ) {
                    max = this.matrizLibros[i][j].getPeso();
                    aux = this.matrizLibros[i][j];
                }
            }
        }
        return aux;
    }
    
    
    
    
}
