/*
 * En el momento de escribir una clase se debe conocer con qué tipo de datos va a interactuar, sin embargo 
   esto no siempre es conocido. Por lo tanto se puede definir una clase con la ayuda de un “contenedor” 
   al cual nos referimos como si fuera el tipo sobre el que opera la clase.
 * Utilizar tipos genericos tiene dos propocitos:
 * 1.Proveer seguridad en tipos: Solo acepta el tipo especificado dentro del operador diamamnte.
 * 2.Evitar casting: Transformar una variable primitiva de un tipo a otro, o transformar un objeto de una clase a otra clase 
                     siempre y cuando haya una relación de herencia entre ambas.
 */
package a49ManejoGenerics;

/**
 *
 * @author Panzer01
 */
public class A143ManejoGenerics {
    public static void main(String[] args) {
        // Creamos una instancia de ClaseGenerica para Integer.
        //Integer es la lcase envolvente equivalente de un tipo de datos int.
        A143ClaseGenerica<Integer> objetoInt = new A143ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();

        // Creamos una instancia de ClaseGenerica para String.
        //Se puede utilizar la inferencia del tipo del lado derecho
        A143ClaseGenerica<String> objetoStr = new A143ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        
        //Los genericos no pueden ser aplicados a tipos primitivos
        //Por lo que esto marcaria un error de compilacion
        //ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int>(88);
    }
}

/* 
Tipo primitivo Clase Envolvente
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean
*/