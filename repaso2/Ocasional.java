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
public class Ocasional extends Recital {
    private String motivo;
    private String nombreContratante;
    private int dia;
    
    public Ocasional(String nombreBanda, int cantTemas, String unMotivo, String nombreContratante, int dia){
        super(nombreBanda, cantTemas);
        this.motivo = unMotivo;
        this.nombreContratante = nombreContratante;
        this.dia = dia;
    }
    
    //SETTERS
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    //GETTERS
    public String getMotivo() {
        return motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    public int getDia() {
        return dia;
    }
    
    //OTROS
    public String actuar(){
        String msj = "";
        if (this.motivo.equalsIgnoreCase("beneficio")) {
            msj = "Recuerden colaborar con " + this.getNombreContratante();
        }
        else if (this.motivo.equalsIgnoreCase("tv"))
            msj = "Saludos amigos televidente";
            else
                msj = "Un feliz cumpleaños para " + this.getNombreContratante();
        return msj + "\n" + super.actuar();
    }
    
    public double calcularCosto(){
        double x;
        if (this.getMotivo().equalsIgnoreCase("beneficio")) {
            x = 0;
        }
        else if (this.getMotivo().equalsIgnoreCase("tv")){
            x = 50000;
        }
        else
            x = 150000;
        return x;
    }
}
