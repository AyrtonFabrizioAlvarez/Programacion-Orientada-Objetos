/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialobjetos.superclase;

/**
 *
 * @author Coco
 */
public abstract class Subsidio {
    private String nombreInvestigador;
    private String nombreTrabajo;
    private String fecha;

    public Subsidio(String nombreInvestigador, String nombreTrabajo, String fecha) {
        this.nombreInvestigador = nombreInvestigador;
        this.nombreTrabajo = nombreTrabajo;
        this.fecha = fecha;
    }

    //GETTERS

    public String getNombreInvestigador() {
        return nombreInvestigador;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public String getFecha() {
        return fecha;
    }
    
    //SETTERS

    public void setNombreInvestigador(String nombreInvestigador) {
        this.nombreInvestigador = nombreInvestigador;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //OTROS METODOS
    
    public String toString(){
        return "Nombre Investigador: " + this.nombreInvestigador + "\n" + 
               "Plan de Trabajo: " + this.nombreTrabajo + "\n" + 
               "Fecha de Solicitud: " + this.fecha + "\n";
    }
    
    //ABSTRACTOS
    public abstract double montoTotalSubsidio();
}
