/**
 * Se usa un bloque try catch, debido a que el constructor de la clase 135Division indico que puede arrojar una excepcion 
   del tipo A135OperationException, que a su vez hereda de la clase Exception(Checked Exception), 
   por eso se añade el try catch.
   En caso contrario, si A135OperationException hubiera heredado de la clase RunTimeException(Unchecked Exception), 
   entonces No estariamos obligados a usar un bloque try catch o declarar la excepcion en la firma del metodo.
 *
 * En resumen, si se tratase de una excepcion del tipo RunTimeException(Unchecked Exception) el compilador 
   pasaria por alto la excepcion y dejara al programador tratar como guste con la excepcion.
   En caso de que se tratase de una excepcion del tipo Exception(Checked Exception), el compilador esta obligado a 
   mostrar un error en el codigo y obliga al programador tratar la excepcion con el uso de throws en la firma del metodo o
   con el uso de un bloque try catch.
 */
package a47_1ExcepcionesPrueba;

import a47_1Excepciones.A135Division;
import a47_1Excepciones.A135OperationException;

/**
 *
 * @author Panzer01
 */
public class A135ManejoExcepciones1 {
    
    public static void main(String[] args) {

        try {
            A135Division division = new A135Division(10, 0);
            division.visualizarOperacion();
        } catch (A135OperationException oe) {
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();
        }
    }

}