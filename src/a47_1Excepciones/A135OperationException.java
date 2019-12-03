/**
 * Esta Subclase hereda de la clase Exception(CheckException), 
   asi que se deben procesar donde sea que se vallan a trabajar este tipo de excepciones.
 */
package a47_1Excepciones;

/**
 *
 * @author Panzer01
 */
public class A135OperationException extends Exception{
    
    //Constructor.
    public A135OperationException(String mensaje) {
        //Inicializamos el mensaje de error de la clase padre(Exception).
        //Mandamos llamar el constructor de la clase padre con la palabra super.
        super(mensaje);
    }
}