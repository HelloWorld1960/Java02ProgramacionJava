/**Definir throws en la firma del metodo nos permite especificar el tipo de excepcion que arroja cierto metodo.
   En este caso indica que puede lanzar una excepcion del tipo A135OperationException(CheckException).
 * Definir la excepcion throws A135OperationException en el constructor de la clase tiene como consecuencia que 
   cuando se creen objetos de esta clase, se debera manejar la excepcion del tipo A135OperationException dentro de un bloque 
   try catch o añadiendo throws A135OperationException a la firma del metodo que la invoque,
   de lo contrario el compilador marcara error.
 */
package a47_1Excepciones;

/**
 *
 * @author Panzer01
 */
public class A135Division {
    //atributo de la clase
    private int numerador;
    //atributo de la clase
    private int denominador;

    /**
     * Construye el objeto Division
     */
    /*Añadiendo throws A135OperationException se indica que dicho constructor puede arrojar una excepcion.
     *La clase A135OperationException hereda de la clase Exception(Checked Exception), debido a eso el compilador 
      esta obligado a añadir el throws A135OperationException en la firma del metodo.
     *En caso contrario, si la clase A135OperationException hubiera heredado de la clase 
      RunTimeException(Unchecked Exception), entonces No deberiamos declararla en la firma de los metodos, 
      es decir poner throws A135OperationException.
     *throw new A135OperationException() nos permite arrojar la excepcion que creamos en la clase  A135OperationException*/
    public A135Division(int numerador, int denominador) throws A135OperationException {

        if (denominador == 0) {
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new A135OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarOperacion() {
        System.out.println("El resultado de la division es: " + (numerador / denominador));
    }
}