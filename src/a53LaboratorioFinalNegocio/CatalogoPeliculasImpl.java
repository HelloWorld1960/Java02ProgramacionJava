/*
 * Implementacion de la interface.
 * Contiene las implementaciones de las operaciones necesarias de la aplicacion CatalogoPeliculas.
 * Esta clase hace uso de la interface AccesoDatos.
 */
package a53LaboratorioFinalNegocio;

import a53LaboratorioFinalDatos.AccesoDatos;
import a53LaboratorioFinalDatos.AccesoDatosImpl;
import a53LaboratorioFinalDomain.Pelicula;
import a53LaboratorioFinalDomainExcepciones.AccesoDatosEx;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Panzer01
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    //Atributos
    public AccesoDatos datos;

    //Constructor
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    //Metodos.
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) { 
        Pelicula nameFilm = new Pelicula();
        boolean anexar=true;
        try {
            nameFilm.setNombre(nombrePelicula);
            datos.escribir(nameFilm, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error: No se pudo agregar pelicula.");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> nameFilm = datos.listar(nombreArchivo);
            for (Pelicula pelicula : nameFilm) {
                //Imprime cada elemento de la coleccion nameFilm.
                System.out.println(pelicula+"");
            }
            System.out.println("");
        } catch (AccesoDatosEx ex) {
            System.out.println("Error: "+ex);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado=null;
        try {
            resultado=datos.buscar(nombreArchivo, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error: "+ex);
        }
        System.out.println(resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        Scanner scan = new Scanner(System.in);
        int opc=0;
        try {
            if (datos.existe(nombreArchivo)) {
                System.out.println("El archivo ya existe.\n");
                try {
                    System.out.println("¿Decea eliminarlo?");
                    System.out.println("1.Si");                    
                    System.out.println("0.No");
                    opc = scan.nextInt();
                    if (opc==1) {
                        datos.borrar(nombreArchivo);
                    } else{
                        System.out.println("Continuando con la ejecucion del programa.");
                    }
                } catch (Exception e) {
                    System.out.println("Opcion invalida.\n");
                }
            }else{
                datos.crear(nombreArchivo);
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }
    }
}
