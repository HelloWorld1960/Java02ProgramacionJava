/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a50PropiedadesSistema;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author Panzer01
 */
public class A146PropiedadesSistema {
    
    
    public static void main(String[] args) {
        
        Properties propiedades = System.getProperties();
        /*Iteramos las propiedades del sistema.
         *propertyNames sirve para obtener todas las propiedades del sistema, la cual regresa una Enumeration.
         *La clase enumeracion nos va a permitir iterar cada uno de los elementos en una coleccion.*/
        Enumeration nombrePropiedades = propiedades.propertyNames();
        
        /*hasMoreElements() pregunta si tiene mas elementos.*/
        while (nombrePropiedades.hasMoreElements()) {
            /*nextElement solicita el siguiente elemento.*/
            /*Hacemos una convercion a un tipo de dato String.*/
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            /*Obtenemos el valor de la propiedad asociada.*/
            /*getProperty regresa el valor de una propiedad que solicitemos dentro de los parentsis.*/
            String valorPropiedad = propiedades.getProperty(nombrePropiedad);
            
            System.out.println("Llave:" + nombrePropiedad + "=" + valorPropiedad);
        }
    }
}