/**
 * SubClase.
 * Esta clase hereda de la clase padre AccesoDatosEx(Checked).
 * 
 */
package a53LaboratorioFinalDomainExcepciones;

/**
 *
 * @author Panzer01
 */
public class EscrituraDatosEx extends AccesoDatosEx{
    
    /*Constructor*/
    public EscrituraDatosEx(String mensaje) {
        //Inicializamos el mensaje de error de la clase padre(Exception).
        //Mandamos llamar el constructor de la clase padre con la palabra super.
        super(mensaje);
    }
}
