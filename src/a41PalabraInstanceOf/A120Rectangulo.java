/*
 * Clase hija de la clase A120FiguraGeometrica.
 */
package a41PalabraInstanceOf;

/**
 *
 * @author Panzer01
 */
public class A120Rectangulo extends A120FiguraGeometrica{
    
    //Sobreescribimos el metodo padre heredado.
    @Override
    public void dibujar(){
        System.out.println("dibujar rectangulo");
    }
}