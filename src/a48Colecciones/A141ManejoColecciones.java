/*
 * Las colecciones son un conjunto de datos que pueden o no tener un ordenamiento en particular.
 * Las colecciones se conocen tambien como estructuras de datos, ya que permiten almacenar informacion 
   de manera estructurada y de maneras mas variadas que en los arreglos.
 * Para usarlas se hace uso del Java Collections Framework (JCF), el cual contiene un conjunto de clases e interfaces 
   del paquete java.util para gestionar colecciones de objetos.
 * En Java las principales interfaces que disponemos para trabajar con colecciones son: Collection, Set, List, Queue y Map.
 * EL API de colecciones en java se divide en List, Set y Map.
   Set: Es una coleccion no ordenada de elementos, no se permiten elementos duplicados, por lo que cualquier elemento 
        duplicado no se insertara.
   List: Es una coleccion ordenada la cual si permite elementos duplicados.
   Map: Relaciona una llave con un valor, formando una especie de tabla de datos.
 */
package a48Colecciones;

import java.util.*;

/**
 *
 * @author Panzer01
 */
public class A141ManejoColecciones {
    
    public static void main(String args[]) {
        /**
        *miLista es una variable del tipo List(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo ArrayList(), 
         la cual es una clase que implementa la clase List().
        *Al No especificar el tipo de dato en el arreglo que estamos utilizando, entonces por default es del tipo Object, 
         asi que las cadenas agregadas al arreglo se convierten en tipos Object.
        *No es necerio agregar un tamaño especifico a la lista, simplemenete podemos agregar elementos a la lista y 
         dinamicamente la lista crecera segun necesitemos.*/
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //Elemento repetido
        miLista.add("4");
        imprimir(miLista);

        /**
        *miSet es una variable del tipo Set(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo HashSet(), 
         la cual es una clase que implementa la clase HashSet().
        *Al No especificar el tipo de dato en el arreglo que estamos utilizando, entonces por default es del tipo Object, 
         asi que las cadenas agregadas al arreglo se convierten en tipos Object.
        *No es necerio agregar un tamaño especifico a miSet, simplemenete podemos agregar elementos y 
         dinamicamente la miSet crecera segun necesitemos.*/
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //No permite elementos repetidos, lo ignora
        miSet.add("300");
        imprimir(miSet);

        /**
        *miSet es una variable del tipo Map(es una interface), debido a que es una interface No se puede crear 
         un nuevo objeto de tipo interface. Lo que se hace es crear un nuevo objeto del tipo HashMap(), 
         la cual es una clase que implementa la clase HashMap().
        *Al No especificar el tipo de dato en el arreglo que estamos utilizando, entonces por default es del tipo Object, 
         asi que las cadenas agregadas al arreglo se convierten en tipos Object.
        *No es necerio agregar un tamaño especifico a miMapa, simplemenete podemos agregar elementos y 
         dinamicamente la miMapa crecera segun necesitemos.*/
        Map miMapa = new HashMap();
        //Lave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        //Se imprimen todas las llaves
        imprimir(miMapa.keySet());
        //Se imprimen todos los valores
        imprimir(miMapa.values());

    }

    /*
    *coleccion es una variable del tipo Collection(es una interfaz), esta interfaz es “la raíz” de todas las interfaces 
     y clases relacionadas con colecciones de elementos.
    *Java no define ninguna implementación de esta interface y son respectivamente sus subinterfaces las que implementarán 
     sus métodos como son por ejemplo las interfaces Set o List (que son subinterfaces de Collection).
    *En esta interfaz encontramos una serie de métodos que nos servirán para acceder a los elementos de cualquier 
     colección de datos, sea del tipo que sea. 
    */
    private static void imprimir(Collection coleccion) {
        /*elemento es una variable del tipo Object debido a que no especificamos el tipo que recibe, por tanto 
          debemos de hacer una convercion a un tipo Object(upcasting) para convertir a cada elemento en un tipo Object. */
        for (Object elemento : coleccion) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}