/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a39Overriding;

/**
 *
 * @author Panzer01
 */
public class A116EjemploSobreescritura {
    
    public static void main(String[] args) {
        A116Empleado empleado = new A116Empleado("Juan",1000);
        System.out.println( empleado.obtenerDetalles() );
        
        A116Gerente gerente = new A116Gerente("Karla",2000,"Finanzas");
        System.out.println( gerente.obtenerDetalles() );
    }
}