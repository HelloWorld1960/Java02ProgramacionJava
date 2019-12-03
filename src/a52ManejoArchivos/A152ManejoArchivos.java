/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a52ManejoArchivos;

import static a52ManejoArchivos.A152Archivos.anexarArchivo;
import static a52ManejoArchivos.A152Archivos.crearArchivo;
import static a52ManejoArchivos.A152Archivos.escribirArchivo;
import static a52ManejoArchivos.A152Archivos.leerArchivo;

/**
 *
 * @author Panzer01
 */
public class A152ManejoArchivos {
    //Nota: Ya debe estar creada la carpeta sobre la que se va a trabajar
    //Y en caso necesario se deben asignar permisos de escritura a la carpeta
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\Jorge01\\Programas\\NetBeansProjects\\Java02ProgramacionJava\\src\\a52ManejoArchivos\\pruebaJava.txt";

    public static void main(String[] args) {

        //Crear un archivo
        crearArchivo(NOMBRE_ARCHIVO);

        //Escribir a un archivo
        escribirArchivo(NOMBRE_ARCHIVO);

        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);

        //Anexar informacion a un archivo
        anexarArchivo(NOMBRE_ARCHIVO);

        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
    }
}