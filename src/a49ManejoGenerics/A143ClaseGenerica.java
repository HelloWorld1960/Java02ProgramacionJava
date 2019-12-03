/*
 * Tipos genericos que pueden ser utilizados.
 *  E: elemento de una colección.
 *  K: clave.
 *  N: número.
 *  T: tipo.
 *  V: valor.
 *  S, U, V etc: para segundos, terceros y cuartos tipos.
 */
package a49ManejoGenerics;

/**
 *
 * @author Panzer01
 */
//Definimos una clase generica con el operador diamante <>
public class A143ClaseGenerica<T> {
    //Definimos una variable de tipo generico
    T objeto;

    //Constructor que inicializa el tipo a utilizar
    public A143ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    /*Utilizamos la API Reflexion la cual nos permite inspeccionar y manipular clases e interfaces (completas es decir 
    métodos y campos) en tiempo de ejecución, sin conocer con anterioridad (es decir en el tiempo de compilación) los 
    tipos y/o nombres de las clases especificas con las que estamos trabajando.*/
    /*Todos los Objetos de java heredan de la clase java.lang.Object y por eso poseen un método llamado getClass() siendo 
    su firma public final Class getClass(), este método nos retorna un objeto java.lang.Class el cual es nuestro punto de 
    entrada para el API Reflect.*/
    /*getName(): Retorna el nombre de los constructores como un String.*/
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}