/*
 * FileWriter: lee un caracter.
 * PrintWriter: lee una linea co,pleta.
 * 
 */
package a52ManejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Panzer01
 */
public class A152Archivos {
    
     public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo); //Creamos una variable de tipo File.
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

     /*Este metodo escribe informacion al archivo, pero borra el contenido previo.*/
    public static void escribirArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();//le asignamos la primer linea.
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();//le asignamos una nueva linea.
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void anexarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la informacion correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}