/**
 * Interface que declara los metodos.
 */
package a47_2Datos;

import a47_2Excepciones.A138AccesoDatosEx;

/**
 *
 * @author Panzer01
 */
public interface A138AccesoDatos {
    
    /*
     * Se indica en los metodos que posiblemente arrojan una excepcion del tipo A138AccesoDatosEx(Checked),
       pero internamente estos metodos podrian arrojar execpiones de menor gerarquia del tipo subclase EscrituraDatosEx o 
       LecturaDatosEx y para generalizar las excepciones se indica que se arroja una excepcion del tipo padre A138AccesoDatosEx.*/
    public abstract void insertar() throws A138AccesoDatosEx;
    
    public abstract void listar() throws A138AccesoDatosEx;
    
    public abstract void simularError(boolean simularError);
}