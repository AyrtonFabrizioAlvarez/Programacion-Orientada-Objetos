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
public class Autor {

    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor (String unNombre, String unaBiografia, String unOrigen) {
        nombre = unNombre;
        biografia = unaBiografia;
        origen = unOrigen;
    }
    
    //SETTERS
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setBiografia(String unaBiografia){
        biografia = unaBiografia;
    }
    public void setOrigen(String unOrigen){
        origen = unOrigen;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getBiografia(){
        return biografia;
    }
    public String getOrigen(){
        return origen;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String msj = nombre + ": " + biografia + " origen: " + origen;
        return msj;
    }
}
