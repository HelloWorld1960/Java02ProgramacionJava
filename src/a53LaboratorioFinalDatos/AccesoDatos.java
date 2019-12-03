/*
 * Interface.
 * Contiene las operaciones a ejecutar en el archivo de peliculas.txt.
 * 
 */
package a53LaboratorioFinalDatos;

import a53LaboratorioFinalDomain.Pelicula;
import a53LaboratorioFinalDomainExcepciones.AccesoDatosEx;
import a53LaboratorioFinalDomainExcepciones.EscrituraDatosEx;
import a53LaboratorioFinalDomainExcepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author Panzer01
 */
public interface AccesoDatos {

    //Metodos
    /*Se indica en los metodos que posiblemente arrojan una excepcion del tipo AccesoDatosEx(Checked),
      pero internamente estos metodos podrian arrojar execpiones de menor gerarquia del tipo subclase EscrituraDatosEx o 
      LecturaDatosEx y para generalizar las excepciones se indica que se arroja una excepcion del tipo padre AccesoDatosEx.
    */
    public abstract boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract List listar(String nombre) throws LecturaDatosEx;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
}
