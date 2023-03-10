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
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaAp;
    private String horaCi;
    private int piso;
    private int plaza;
    private Auto [][] estacionamiento;

    public Estacionamiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaAp = "8:00";
        this.horaCi = "21:00";
        this.piso = 5;
        this.plaza = 10;
        this.estacionamiento = new Auto[this.piso][this.plaza];
    }
    
    public Estacionamiento(String unNombre, String unaDireccion, String horaAp, String horaCi, int pisos, int plazas){
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.horaAp = horaAp;
        this.horaCi = horaCi;
        this.piso = pisos;
        this.plaza = plazas;
        this.estacionamiento = new Auto [this.piso][this.plaza];
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHoraAp(String horaAp) {
        this.horaAp = horaAp;
    }

    public void setHoraCi(String horaCi) {
        this.horaCi = horaCi;
    }
    
    public void setPisos(int cantPisos){
        this.piso = cantPisos;
    }
    
    public void setPlazas(int cantPlazas){
        this.plaza = cantPlazas;
    }
    
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHoraAp() {
        return horaAp;
    }

    public String getHoraCi() {
        return horaCi;
    }
    
    public int getPisos(){
        return this.piso;
    }
    
    public int getPlazas(){
        return this.plaza;
    }
    
    
    //OTROS
    
    public void registrarAuto(Auto A, int unPiso, int unaPlaza){
        this.estacionamiento[unPiso][unaPlaza] = A;
    }
    
    public String ubicarAuto(String buscado){
        int x = 0;
        int y;
        boolean ok = false;
        String msj = "Auto inexistente";
        while ( (x < this.getPisos()) && (!ok) ) {
            y = 0;
            while ( (y < this.getPlazas()) && (!ok) ) {
                if ( (this.estacionamiento[x][y] != null) && (this.estacionamiento[x][y].getPatente().equalsIgnoreCase(buscado)) ) {
                    ok = true;
                    msj = "Piso: " + x + " Plaza: " + y;
                }
                y++;
            }
            x++;
        }
        return msj;
    }
    
    public String toString(){
        String msj = "";
        for (int i = 0; i < this.getPisos(); i++) {
            msj += "Piso " + (i+1) + "\n\n";
            for (int j = 0; j < this.getPlazas(); j++) {
                if (this.estacionamiento[i][j] == null) {
                    msj += "Plaza " + (j+1) + ": Libre" + "\n\n";
                }
                else
                    msj += "Plaza " + (j+1) + ":  " + "\n" + this.estacionamiento[i][j].toString() + "\n";
            }
        }
        return msj;
    }
    
    public int contarPlaza(int plaza){
        int x = 0;
        for (int i = 0; i < this.getPisos(); i++) {
            if (this.estacionamiento[i][plaza] != null) {
                x++;
            }
        }
        return x;
    }
}
