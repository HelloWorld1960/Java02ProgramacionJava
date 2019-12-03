/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a49ManejoGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Panzer01
 */
public class A145ManejoColeccionesGenrics {
    
    public static void main(String[] args) {
        /*
        *miLista es una variable del tipo List(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo ArrayList(), 
         la cual es una clase que implementa la clase List().
        *Especificamos el tipo de dato dentro del operador diamante, el cual es String.
        */
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);

        /*
        *miSet es una variable del tipo Set(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo HashSet(), 
         la cual es una clase que implementa la clase HashSet().
        *Especificamos el tipo de dato dentro del operador diamante, el cual es String.
        */
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);

        /*
        *miSet es una variable del tipo Map(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo HashMap(), 
         la cual es una clase que implementa la clase HashMap().
        *Especificamos dentro del operador diamante que la llave es de tipo String y el tipo de dato tambien es String, 
         en ese orden respectivamente.
        */
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    /*
    *coleccion es una variable del tipo Collection(es una interfaz), esta interfaz es “la raíz” de todas las interfaces 
     y clases relacionadas con colecciones de elementos.
    *Java no define ninguna implementación de esta interface y son respectivamente sus subinterfaces las que implementarán 
     sus métodos como son por ejemplo las interfaces Set o List (que son subinterfaces de Collection).
    *En esta interfaz encontramos una serie de métodos que nos servirán para acceder a los elementos de cualquier 
     colección de datos, sea del tipo que sea. 
    *Especificamos el tipo de dato dentro del operador diamante, el cual es String.
    */
    static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}