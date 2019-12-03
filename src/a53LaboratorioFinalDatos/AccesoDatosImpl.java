/*
 * Clase que implementa la interface.
 * Contiene la implementacion a ejecutar en el archivo de catalogoPeliculas.txt.
 * 
 */
package a53LaboratorioFinalDatos;

import a53LaboratorioFinalDomain.Pelicula;
import a53LaboratorioFinalDomainExcepciones.AccesoDatosEx;
import a53LaboratorioFinalDomainExcepciones.EscrituraDatosEx;
import a53LaboratorioFinalDomainExcepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Panzer01
 */
public class AccesoDatosImpl implements AccesoDatos {
    
    /*Implementacion de los metodos de la interface AccesoDatos.
      En la firma del metodo se declara una excepcion de mayor gerarquia(AccesoDatosEx) para poder  acceder a excepciones 
      de menor gerarquia como EscrituraDatosEx, LecturaDatosEx.*/
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx{
        try {
            File archivo = new File(nombreArchivo); //Creamos una variable de tipo File.
            if (archivo.exists()) {//Comprobamos existencia del archivo.
                return (true);
            }else{
                return (false);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return (false);
    }
    
    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx{
        File archivo = new File(nombreArchivo);
        List<Pelicula> miLista = new ArrayList<Pelicula>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();//le asignamos la primer linea.
            while (linea != null) {
                Pelicula nameFilm = new Pelicula(linea);
                miLista.add(nameFilm);
                linea = entrada.readLine();//le asignamos una nueva linea.
            }
            entrada.close();
        } catch (Exception ex) {
            System.out.println("Error: No se ha podido Listar el contenido del archivo.");
        }
        return (miLista);
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");
        } catch (Exception ex) {
            System.out.println("No se ha podido escribir en el archivo.");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx{
        int cout=1;
        String resultado=null;
        try {
            File archivo = new File(nombreArchivo); //Creamos una variable de tipo File.
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();//le asignamos la primer linea.
            while (linea != null) {
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado="La pelicula "+buscar+" fue encontrada en la linea "+cout+"\n";
                    break;
                }
                linea = entrada.readLine();//le asignamos una nueva linea.
                cout++;
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error: No se ha podido buscar en el archivo.");
        }
        return (resultado);
    }
    
    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx{
        try {
            File archivo = new File(nombreArchivo); //Creamos una variable de tipo File.
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error: El archivo no pudo ser creado.");
        }
    }
    
    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx{
        try {
            File archivo = new File(nombreArchivo); //Creamos una variable de tipo File.
            archivo.delete();
            System.out.println("El archivo fue borrado exitosamente.\n");
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}
