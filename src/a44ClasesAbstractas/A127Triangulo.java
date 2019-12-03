/*
 * 
 */
package a44ClasesAbstractas;

/**
 *
 * @author Panzer01
 */
public class A127Triangulo extends A127FiguraGeometrica{
    //Constructor
    public A127Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    /*Se implementa el metodo dibujar() de la clase padre, ahora definiendo un comportamiento.
    getClass().getSimpleName() es un metodo de la clase Object que devuelve el nombre de la clase.
    Con la palabra this hacemos referencia a la clase actual.*/
    public void dibujar() {
        //Implementacion del metodo dibujar heredado de la clase FiguraGeometrica
        System.out.println("Aqui debera dibujar un: " + this.getClass().getSimpleName());
    }
}