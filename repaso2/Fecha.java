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
public class Fecha {
    private String ciudad;
    private int dia;
    
    public Fecha(String unaCiudad, int unDia){
        this.ciudad = unaCiudad;
        this.dia = unDia;
    }
    
    //SETTERS
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    //GETTERS
    public String getCiudad() {
        return ciudad;
    }

    public int getDia() {
        return dia;
    }
    
    //OTROS
    
    
}
