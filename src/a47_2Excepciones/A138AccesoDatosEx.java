/**
 * Clase padre.
 * Esta super clase hereda de Exception(Checked).
 */
package a47_2Excepciones;

/**
 *
 * @author Panzer01
 */

public class A138AccesoDatosEx extends Exception{
    
    /*Constructor*/
    public A138AccesoDatosEx(String mensaje){
        /*Inicializando al constructor de la clase padre*/
        super(mensaje);
    }
}