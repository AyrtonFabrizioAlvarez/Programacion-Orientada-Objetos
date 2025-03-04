/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Coco
 */
public class VisorFigurasModificado {

    private int guardadas;
    private int capacidadMaxima = 5;
    private Figura[] vector;

    public VisorFigurasModificado() {
        this.vector = new Figura[this.capacidadMaxima];
        this.guardadas = 0;
    }

    public void guardar(Figura f) {
        vector[guardadas] = f;
        guardadas++;
    }

    public boolean quedaEspacio() {
        if (guardadas < capacidadMaxima){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.guardadas; i++) {
            System.out.println(i + "- " + vector[i].toString());
        }
    }

    public int getGuardadas() {
        return guardadas;
    }
}
