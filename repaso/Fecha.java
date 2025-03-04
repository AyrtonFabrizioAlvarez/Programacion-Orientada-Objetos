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
public class Fecha {
    private String ciudad;
    private String dia;

    public Fecha(String ciudad, String dia) {
        this.ciudad = ciudad;
        this.dia = dia;
    }
    
    //GETTERS

    public String getCiudad() {
        return ciudad;
    }

    public String getDia() {
        return dia;
    }
    
    //SETTERS

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
}
