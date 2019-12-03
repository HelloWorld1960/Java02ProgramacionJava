/*
 * Interface.
 * Contiene las operaciones necesarias de la aplicacion CatalogoPeliculas.
 * 
 */
package a53LaboratorioFinalNegocio;

/**
 *
 * @author Panzer01
 */
public interface CatalogoPeliculas {
    //Atributos.
    
    //Metodos.
    public abstract void agregarPelicula(String nombrePelicula, String nombreArchivo);
    
    public abstract void listarPeliculas(String nombreArchivo);
    
    public abstract void buscarPelicula(String nombreArchivo, String buscar);
    
    public abstract void iniciarArchivo(String nombreArchivo);
}
