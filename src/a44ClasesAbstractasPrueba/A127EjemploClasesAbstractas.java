/*

 */
package a44ClasesAbstractasPrueba;

import a44ClasesAbstractas.A127Circulo;
import a44ClasesAbstractas.A127FiguraGeometrica;
import a44ClasesAbstractas.A127Rectangulo;
import a44ClasesAbstractas.A127Triangulo;

/**
 *
 * @author Panzer01
 */
public class A127EjemploClasesAbstractas {
    public static void main(String args[]) {

        //Creacion de objetos
        A127FiguraGeometrica rectangulo = new A127Rectangulo("Rectangulo");
        A127FiguraGeometrica triangulo = new A127Triangulo("Triangulo");
        A127FiguraGeometrica circulo = new A127Circulo("Circulo");

        System.out.println(rectangulo);//Llamo al metodo toString de la clase A127Rectangulo, el cual es heredado de la clase A127FiguraGeometrica.
        rectangulo.dibujar();//Usando el pilimorfismo accedemos al metodo de la clase A127Rectangulo.

        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();//Usando el pilimorfismo accedemos al metodo de la clase A127Triangulo.

        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();//Usando el pilimorfismo accedemos al metodo de la clase A127Circulo.

    }
}