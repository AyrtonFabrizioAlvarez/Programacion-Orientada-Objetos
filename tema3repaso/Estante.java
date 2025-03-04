/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3repaso;

/**
 *
 * @author Coco
 */
public class Estante {
    private Libro[] estante;
    private int dimF;
    private int dimL = 0;
    
    public Estante(int cantLibros){
        this.dimF = cantLibros;
        this.estante = new Libro[this.dimF];
    }
    
    public int contarLibros(){
        return dimL;
    }
    
    public boolean estaLleno(){
        return (dimL == dimF);
    }
    
    public void agregarLibro(Libro L){
        this.estante[dimL] = L;
        dimL++;
    }
    
    public Libro buscarTitulo(String buscado){
        boolean ok = false;
        int pos = 0;
        Libro L = null;
        while ( (pos < dimF) && (!ok) ) {
            if (this.estante[pos].getTitulo().equals(buscado)) {
                ok = true;
                L = this.estante[pos];
            }
            pos++;
        }
        
        return L;
    }
}
