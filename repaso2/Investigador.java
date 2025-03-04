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
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private int dimL;
    private Subsidio [] subsidios = new Subsidio[5];
    
    public Investigador(String unNombre, int unaCategoria, String unaEspecialidad){
        this.nombre = unNombre;
        this.categoria = unaCategoria;
        this.especialidad = unaEspecialidad;
        this.dimL = 0;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    
    
    //OTROS
    public void agregarSubsidio(Subsidio S){
        if (this.dimL < 5) {
            subsidios[dimL] = S;
            dimL++;
        }
    }
    
    public double calcularTotalSubsidios(){
        double total = 0;
        for (int i = 0; i < dimL; i++) {
            if (this.subsidios[i].isOtorgado()) {
                total += this.subsidios[i].getMonto();
            }
        }
        return total;
    }
    
    public void otorgarNegados(){
        for (int i = 0; i < dimL; i++) {
            this.subsidios[i].setOtorgado(true);
        }
    }
    
    public String toString(){
        return "Nombre: " + this.getNombre() + "\n" + 
               "Categoria: " + this.getCategoria() + "\n" + 
               "Especialidad: " + this.getEspecialidad() + "\n" + 
               "Total monto en subsidios: " + this.calcularTotalSubsidios();
    }
}
