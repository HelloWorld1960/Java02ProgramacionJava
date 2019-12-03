/*
 * 
 */
package a44ClasesAbstractas;

/**
 *
 * @author Panzer01
 */
public class A127Rectangulo extends A127FiguraGeometrica{
    
    //Constructor
    public A127Rectangulo(String tipoFigura) {
    /*super invoca al constructor de la clase superior(A127FiguraGeometrica) que comparta el mismo tipo de parametrización, esto 
      para asignarle el parametro tipoFigura.*/
        super(tipoFigura);
    }

    /*Se implementa el metodo dibujar() de la clase padre, ahora definiendo un comportamiento.
    getClass().getSimpleName() es un metodo de la clase Object que devuelve el nombre de la clase.
    Con la palabra this hacemos referencia a la clase actual.*/
    public void dibujar() {
        //Comportamiento de la subclase
        System.out.println("Aqui debera dibujar un: " + this.getClass().getSimpleName());
    }
}