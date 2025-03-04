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
public class Libro {
    public String titulo;
    public Autor primerAutor;
    public String editorial;
    public int añoEdicion;
    public String isbn;
    public double precio;
    
    public Libro(String unTitulo, Autor unAutor, String unaEditorial, int unAño, String isbn, double precio){
        this.titulo = unTitulo;
        this.primerAutor = unAutor;
        this.editorial = unaEditorial;
        this.añoEdicion = unAño;
        this.isbn = isbn;
        this.precio = precio;
    }
    
    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrimerAutor(Autor primerAutor) {
        this.primerAutor = primerAutor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }   

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }
    
    //OTROS
    public String toString(){
        return this.titulo + " por " + this.primerAutor.getNombre() + " - " + this.añoEdicion + " - " + this.isbn;
    }
    
}
