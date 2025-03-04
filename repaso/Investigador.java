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
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio [] vectorSubsidios = new Subsidio[5];
    private int dimL;
    
    
    //CONSTRUCTOR
    public Investigador (String nombre, int categoria, String especialidad){
        this.nombre = nombre;
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.dimL = 0;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCategoria(){
        return this.categoria;
    }
    
    public String getEspecialidad(){
        return this.especialidad;
    }
    
    public int getDimL(){
        return this.dimL;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    //METODOS PROPIOS
    public void agregarSubsidio(Subsidio S){
        this.vectorSubsidios[this.dimL] = S;
        this.dimL++;
    }
    
    public double calcularTotalSubsidios(){  // ESTE METODO LO AGREGUE YO PARA NO ACCEDER AL VECTOR PROPIO DEL INVESTIGADOR DENTRO DEL PROYECTO
        double total = 0;                    // VER "dineroTotal0torgado()" EN LA CLASE PROYECTO
        for (int i = 0; i < this.dimL; i++) {
            if (this.vectorSubsidios[i].getOtorgado()) {
                total = total + this.vectorSubsidios[i].getMonto();
            }
        }
        return total;
    }
    
    public void otorgarNegados(){ //MISMO CASO QUE EN EL METODO ANTERIOR (VER "otorgarTodos()" EN LA CLASE PROYECTO)
        for (int i = 0; i < this.dimL; i++) {
            if (!this.vectorSubsidios[i].getOtorgado()) {
                this.vectorSubsidios[i].setOtorgado();
            }
        }
    }
    

    
    public String toString(){
        return "Nombre: " + this.nombre + "\n" + 
               "Categoria: " + this.categoria + "\n" + 
               "Especialidad: " + this.especialidad + "\n" + 
               "Total en Subsidios " + this.calcularTotalSubsidios() + "\n";
    }
}
