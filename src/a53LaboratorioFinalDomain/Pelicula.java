/*
 * Representa los objetos pelicula uilizados en la aplicacion catalogo de peliculas.
 * 
 * 
 */
package a53LaboratorioFinalDomain;

/**
 *
 * @author Panzer01
 */
public class Pelicula {

    //Atributos
    private String nombre;
    
    //Constructor
    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre=nombre;
    }
    
    //Metodos
    public String getNombre(){
        return (nombre);
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString() {
        return (this.nombre);
    }
}
