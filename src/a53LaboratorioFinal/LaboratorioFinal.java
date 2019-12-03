/*
 * Interfaz de usuario.
 * Contiene el menu que permite al usuario seleccionar la accion a jecutar sobre el catalogo peliculas.
 * Esta clase hace uso de la interface CatalogoPeliculas para ejecutar cada accion..
 */
package a53LaboratorioFinal;

import a53LaboratorioFinalNegocio.CatalogoPeliculas;
import a53LaboratorioFinalNegocio.CatalogoPeliculasImpl;
import java.util.Scanner;

/**
 *
 * @author Panzer01
 */
public class LaboratorioFinal {
    //Nota: Ya debe estar creada la carpeta sobre la que se va a trabajar
    //Y en caso necesario se deben asignar permisos de escritura a la carpeta
    private static final String nombreArchivo = "C:\\Users\\Jorge01\\Programas\\NetBeansProjects\\Java02ProgramacionJava\\src\\a53LaboratorioFinal\\catalogoPeliculas.txt";
        
    public static void main(String[] args){
        CatalogoPeliculas catalogoPeliculas=new CatalogoPeliculasImpl();
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        String nombrePelicula;
        
        do{
            try {
                System.out.println("Elija una opcion:");
                System.out.println("1.Iniciar catalogo peliculas.");
                System.out.println("2.Agregar peliculas.");
                System.out.println("3.Listar peliculas.");
                System.out.println("4.Buscar pelicula");
                System.out.println("0.Salir.");
                opc = scan.nextInt();

                switch(opc){
                    case 1:
                        /*Declaramos un objeto de tipo interfaz CatalogoPeliculas que declara los metodos de CatalogoPeliculasImpl*/
                        System.out.println("\nCreando Catalogo Peliculas.");
                        catalogoPeliculas.iniciarArchivo(nombreArchivo);
                    break;

                    case 2:
                        /*Se debe limpiar el buffer de entrada si se van a leer datos de tipo carácter a continuación de la lectura de datos numéricos.*/
                        scan.nextLine();
                        System.out.println("\nIntroduce el nombre de una pelicula a agregar:");
                        nombrePelicula = scan.nextLine();
                        catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
                    break;

                    case 3:
                        System.out.println("\nLista de peliculas:");
                        catalogoPeliculas.listarPeliculas(nombreArchivo);
                    break;

                    case 4:
                        /*Se debe limpiar el buffer de entrada si se van a leer datos de tipo carácter a continuación de la lectura de datos numéricos.*/
                        scan.nextLine();
                        System.out.println("\nIntroduce el nombre de la pelicula a buscar:");
                        nombrePelicula = scan.nextLine();
                        catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
                    break;
                    
                    case 0:
                        System.out.println("\nFin del programa.");
                    break;
                        
                    default:
                        System.out.println("\nOpcion incorrecta.");
                }
            } catch (Exception ex) {
                System.out.println("Error: "+ex);
            }
        }while (opc!=0);
    }
}
