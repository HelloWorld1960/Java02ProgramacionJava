/*
 * Derechos reservados 
 */
package a32JavaDocPrueba;

import a32JavaDoc.*;
/**
 * Clase para probar el concepto de JavaDoc
 * @author Panzer00
 * @version 1.0
 */
public class A100JavaDoc {
    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int resultado = new A100Aritmetica(3, 2).sumar();

        System.out.println("resultado:" + resultado);
    }
}