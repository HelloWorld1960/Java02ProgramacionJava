/*
 * Para ejecutar este programa se deben pasar los argumentos en el apartado de propiedades -> run -> Arguments.
   Dar click derecho en la carpeta de la clase y seleccionar ejecutar.
 */
package a47_1ExcepcionesPrueba;

import a47_1Excepciones.A135Division;
import a47_1Excepciones.A135OperationException;

/**
 *
 * @author Panzer01
 */
public class A135ManejoExcepcionesArg {

    public static void main(String args[]) throws A135OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            A135Division div = new A135Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();//imprimir el stacktrace de esta excepcion.
        } catch (NumberFormatException nfe) {
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Uno de los argumentos no es entero");
            nfe.printStackTrace();//imprimir el stacktrace de esta excepcion.
        } catch (A135OperationException oe) {
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Se trata de realizar una operacion erronea");
            oe.printStackTrace();//imprimir el stacktrace de esta excepcion.
        } finally {
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}