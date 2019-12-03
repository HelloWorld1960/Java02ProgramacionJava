/**
 * Clase padre.
 * Esta super clase hereda de Exception(Checked).
 * Esta Subclase hereda de la clase Exception(CheckException), 
   asi que se deben procesar donde sea que se vallan a trabajar este tipo de excepciones.
 */
package a53LaboratorioFinalDomainExcepciones;

/**
 *
 * @author Panzer01
 */
public class AccesoDatosEx extends Exception{

    /*Constructor*/
    public AccesoDatosEx(String mensaje) {
        //Inicializamos el mensaje de error de la clase padre(Exception).
        //Mandamos llamar el constructor de la clase padre con la palabra super.
        super(mensaje);
    }
}
