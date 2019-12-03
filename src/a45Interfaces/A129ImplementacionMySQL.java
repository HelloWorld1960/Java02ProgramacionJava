/*
 * Clase hija que implementa los metodos declarados en la clase padre A129AccesoDatos(interface).
 * Una clase puede implementar una o varias interfaces: en ese caso, la clase debe proporcionar la declaración y definición 
   de todos los métodos de cada una de las interfaces o bien declararse como clase abstract.
 * 
 */
package a45Interfaces;

/**
 *
 * @author Panzer01
 */
public class A129ImplementacionMySQL implements A129AccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
           System.out.println("Listar desde MySql");
    }
    
}