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
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private double apertura;
    private double cierre;
    private int piso;
    private int plaza;
    private Auto [][] matriz;
    
    public Estacionamiento(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.apertura = 08.00;
        this.cierre = 21.00;
        this.piso = 5;
        this.plaza = 10;
        this.matriz = new Auto[this.piso][this.plaza];
    }
    
    public Estacionamiento(String nombre, String direccion, double apertura, double cierre, int piso, int plaza){
        this.nombre = nombre;
        this.direccion = direccion;
        this.apertura = apertura;
        this.cierre = cierre;
        this.piso = piso;
        this.plaza = plaza;
        this.matriz = new Auto[this.piso][this.plaza];
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getApertura() {
        return apertura;
    }

    public double getCierre() {
        return cierre;
    }

    public int getPiso() {
        return piso;
    }

    public int getPlaza() {
        return plaza;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public void setCierre(double cierre) {
        this.cierre = cierre;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public void setMatriz(Auto[][] matriz) {
        this.matriz = matriz;
    }
    
    //OTROS METODOS
    
    public void registrarAuto(Auto A, int piso, int plaza){
        this.matriz[piso-1][plaza-1] = A;
    }
    
    public String buscarPosicionAuto(String patenteBuscada){
        boolean encontre = false;
        int posPiso = 0;
        int posPlaza = 0;
        while ( (posPiso < this.piso) && (!encontre) ) {
            posPlaza = 0;
            while ( (posPlaza < this.plaza) && (!encontre) ) {
                if ( (this.matriz[posPiso][posPlaza] != null) && (this.matriz[posPiso][posPlaza].getPatente().equalsIgnoreCase(patenteBuscada)) )  {
                    encontre = true;
                }
                else{
                    posPlaza++;
                }
            }
            if (!encontre) {
                posPiso++; 
            }
        }
        String msj = "";
        if (encontre) {
            msj = "El auto con patente " + patenteBuscada + " se encuentra en el piso " + (posPiso+1) + " en la plaza " + (posPlaza+1);
        }
        else{
            msj = "Auto inexistente";
        }
        return msj;
    }
    
    public String toString(){
        String msj = "";
        String estado = "";
        String descripcion = "";
        for (int i = 0; i < this.piso; i++) {
            for (int j = 0; j < this.plaza; j++) {
                estado = " libre";
                descripcion = "";
                if (this.matriz[i][j] != null) {
                    descripcion = this.matriz[i][j].toString();
                    estado = "";
                }
                
                msj = msj + "PISO " + (i+1) + " PLAZA " + (j+1) + ": " + estado +  " " + descripcion + "\n";
            }
        }
        return msj;
    }
    
    public int contarAutosPorPlaza(int plazaBuscada){
        int total = 0;
        for (int i = 0; i < this.piso; i++) {
            if (this.matriz[i][plazaBuscada-1] != null) {
                total = total + 1;
            }
        }
        return total;
    }
}
