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
public class Libro {
    private String titulo;
    private String nombreAutor;
    private double peso;

    public Libro(String titulo, String nombreAutor, double peso) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.peso = peso;
    }

   //GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public double getPeso() {
        return peso;
    }
    
    //SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //OTROS METODOS

    public String toString(){
        return "Titulo: " + this.getTitulo() + "\n" + 
               "Nombre Autor: " + this.getNombreAutor() + "\n" + 
               "Peso: " + this.getPeso() + "\n";
    }
    
    
}
