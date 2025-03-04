/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Coco
 */
public class Estante {
    private Libro [] vectorLibros;
    private int dimF;
    private int dimL = 0;
  

    public Estante(int dimF) {
        this.dimF = dimF;
        this.vectorLibros= new Libro[dimF];
    }
    
 
    public void setDimF(int dimFisica){
        this.dimF = dimFisica;
    }

    public void addLibro(Libro l){
        this.vectorLibros[dimL] = new Libro();
        this.vectorLibros[dimL] = l;
        dimL++;
    }
    
     

    public int getCantLibros(){
        return dimL;
    }
    
    public boolean getSiEstaLleno() {
        return dimL >= dimF;
    }
    
    public Libro getLibroPorTitulo(String buscado){
        int pos = -1;
        for (int i = 0; i < dimL; i++) {
            if (vectorLibros[i].getTitulo().equalsIgnoreCase(buscado)){
                pos = i;
            } 
        }
        if (pos != -1) {
            return vectorLibros[pos];
        }
        else{
            return null;
        }
    }
    
}


/*3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
*/
