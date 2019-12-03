/*
 * 
 */
package a47_2ExcepcionesPrueba;

import a47_2Datos.A138AccesoDatos;
import a47_2Datos.A138ImplementacionMySql;
import a47_2Excepciones.A138AccesoDatosEx;
import a47_2Excepciones.A138LecturaDatosEx;

/**
 *
 * @author Panzer01
 */
public class A138ManejoExcepciones2 {
    
    public static void main(String[] args) {
        /*Declaramos un objeto de tipo A138AccesoDatos que declara los metodos de A138ImplementacionMySql*/
        A138AccesoDatos datos = new A138ImplementacionMySql();
        //Cambiamos el estado a simularError = true
        datos.simularError(true);
        ejecutar(datos, "listar");
        
        //Cambiamos el estado a simularError = false
        System.out.println("");
        datos.simularError(false);
        ejecutar(datos, "insertar");
        
        //Cambiamos el estado a simularError = true
        System.out.println("");
        datos.simularError(true);
        ejecutar(datos, "");
    }

    private static void ejecutar(A138AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {
            try {
                datos.listar();
            }
            //Si se van a procesar varias excepciones de la misma jerarquia
            //siempre se debe procesar primero la excepcion de menor jerarquia
            //y posteriormente la de mayor jerarquia
            catch (A138LecturaDatosEx ex) {
                System.out.println("Error lectura: Procesa la excepcion mas especifica de lectura de datos");
            } catch (A138AccesoDatosEx ex) {
                System.out.println("Error Acceso datos: Procesa la excepcion mas generica de acceso a datos");
            } catch (Exception ex) {
                System.out.println("Error general");
            }
            finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (A138AccesoDatosEx ex) {
                System.out.println("Error acceso datos: Podemos procesar solo la excepcion mas generica");
            }
            finally{
                System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
            }
        }
        else{
            System.out.println("No se proporciono ninguna accion conocida");
            }
    }
}