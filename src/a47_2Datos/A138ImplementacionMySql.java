/*
 * Clase que implementa las Interfaces de la clase A138AccesoDatos.
 * por eso se añade implements A138AccesoDatos en la firma del metodo.
 */
package a47_2Datos;

import a47_2Excepciones.A138AccesoDatosEx;
import a47_2Excepciones.A138EscrituraDatosEx;
import a47_2Excepciones.A138LecturaDatosEx;

/**
 *
 * @author Panzer01
 */
public class A138ImplementacionMySql implements A138AccesoDatos{
    /*Atributos*/
    private boolean simularError;
    
    /*Implementacion de los metodos de la interface.
      En la firma del metodo se declara una excepcion de mayor gerarquia(A138AccesoDatosEx) para poder  acceder a excepciones 
      de menor gerarquia como A138EscrituraDatosEx, A138LecturaDatosEx.*/
    @Override
    public void insertar() throws A138AccesoDatosEx {
         if (simularError) {
            throw new A138EscrituraDatosEx("Error de escritura de datos");
        } else {
             System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws A138AccesoDatosEx {
        if (simularError) {
            throw new A138LecturaDatosEx("Error de lectura de datos");
        } else {
            System.out.println("Listar desde MySql");
        }
    }

    /*Metodo get*/
    public boolean isSimularError() {
        return (simularError);
    }

  
    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

}