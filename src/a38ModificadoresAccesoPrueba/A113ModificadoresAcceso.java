package a38ModificadoresAccesoPrueba;

import a38ModificadoresAcceso.*;
import a38ModificadoresAcceso2.*;
/**
 *
 * @author Panzer01
 */
public class A113ModificadoresAcceso {
    public static void main(String[] args) {
        //Prueba de accesos a A113Clase1 desde otras clases
        //Acceso a A113Clase1 desde A113Clase2
        System.out.println("***Acceso desde Clase 2 a Clase 1 (mismo paquete)***");
        new A113Clase2().pruebaDesdeClase2();

        //Acceso a A113Clase 1 desde A113Clase2
        //A113Clase 3 extiende de A113Clase 1
        System.out.println("\n***Acceso desde Clase 3 a Clase 1 (diferente paquete, pero es subclase)***");
        new A113Clase3().pruebaDesdeClase3();

        //Acceso a A113Clase 1 desde A113Clase4
        //A113Clase4 NO es subclase y esta en otro paquete
        System.out.println("\n***Acceso desde Clase 4 a Clase 1 (diferente paquete, NO es subclase)***");
        new A113Clase4().pruebaDesdeClase4();
    }
}