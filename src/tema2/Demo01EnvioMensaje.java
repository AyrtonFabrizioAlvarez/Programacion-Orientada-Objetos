/*
Demo Envio de mensaje a un objeto string
 */
package tema2;

/**
 *
 * @author vsanz
 */
public class Demo01EnvioMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saludo1 = "holaProbandoCantidadDeCaracteres";
        /*Envio al objeto string el mensaje length, provoca que se ejecute el método length - 
        devuelve la longitud - la cual se imprime */
        System.out.println(saludo1.length());    //Imprime 4
        /*Envio al objeto string el mensaje charAt(0), provoca que se ejecute el método charAt - 
        devuelve el caracter en la posición recibida - el cual se imprime */
        System.out.println(saludo1.charAt(30));   //Imprime h
        System.out.println(saludo1.toUpperCase().equals("HOLAPROBANDOCANTIDADDECARACTERES")); // Imprime true

    }
    
}
