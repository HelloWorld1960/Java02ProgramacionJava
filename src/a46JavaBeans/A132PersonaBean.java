/**
 * JavaBean no es más que una clase en Java que sigue ciertos requisitos al momento de crearse de acuerdo a las
   especificaciones de la API para JavaBeans de la plataforma Java.
 * 1)Debe tener un constructor vacío.
 * 2)Debe implementar la interfaz Serializable
 * 3)Las propiedades/atributos deben ser privados.
 * 4)Debe tener métodos getters o setters o ambos que permitan acceder a sus propiedades
 * Se utiliza la interfaz Serializable debido a que por lo general la información que es persiste debe viajar mediante la red
   a un servidor por lo que un objeto que se envía a guardar debe ser descompuesto en bytes, la interfaz serializable permite
   que un objeto sea descompuesto a bytes y que al otro lado pueda ser reconstruido.

 */
package a46JavaBeans;

import java.io.Serializable;

/**
 *
 * @author Panzer01
 */

//1. Implementa la interface Serializable del paquete java.io
public class A132PersonaBean implements Serializable{
    //2. Cada propiedad es de tipo private
    private String nombre;
    private int edad;

    //3. Siempre tiene un Constructor sin argumentos
    public A132PersonaBean() {
    }

    // Constructor del JavaBean (No requerido)
    public A132PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //4. Por cada propiedad agrega un get y set
    //o solo alguno de ellos si es que no requiere de ambos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
}
