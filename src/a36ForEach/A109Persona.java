package a36ForEach;

/**
 *
 * @author Panzer01
 */
public class A109Persona {
    private final int idPersona;
    private String nombre;

    private static int contadorPersonas;
    
    A109Persona(String nombre){
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}