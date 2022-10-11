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
public class Evento extends Recital {
    private String motivo;
    private String nombreContratista;
    private String dia;

    public Evento(String motivo, String nombreContratista, String dia, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.motivo = motivo;
        this.nombreContratista = nombreContratista;
        this.dia = dia;
    }
    
    //GETTERS

    public String getMotivo() {
        return motivo;
    }

    public String getNombreContratista() {
        return nombreContratista;
    }

    public String getDia() {
        return dia;
    }
    
    //SETTERS

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setNombreContratista(String nombreContratista) {
        this.nombreContratista = nombreContratista;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    //OTROS METODOS
    public String actuar(){
        String msj;
        if (this.getMotivo().equalsIgnoreCase("show de beneficiencia")) {
            msj = "Recuerden colaborar con " + this.getNombreContratista() + "\n" + super.actuar();
        }
        else if (this.getMotivo().equalsIgnoreCase("show de tv")) {
            msj = "Saludos amigos televidentes " + "\n" + super.actuar();
            }
            else {
                msj = "Un feliz cumpleaños para " + this.getNombreContratista() + "\n" + super.actuar();
            }
        
        return msj;
    }
    
    //ABSTRACTOS
    public int calcularCosto(){
        int monto;
        if (this.getMotivo().equalsIgnoreCase("show de beneficiencia")) {
            monto = 0;
        }
        else if (this.getMotivo().equalsIgnoreCase("show de tv")) {
            monto = 50000;
            }
        else {
            monto = 150000;
        }
        return monto;
    }
}
