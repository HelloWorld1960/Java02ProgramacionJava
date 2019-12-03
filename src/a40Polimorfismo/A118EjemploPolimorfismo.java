/*
 * En una relación de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquiera de sus subclases. 
 * Esto significa que la clase padre o superclase es compatible con los tipos que derivan de ella. Pero no al revés. 
 * Poli = muchos
 * Morfismo = forma
 */
package a40Polimorfismo;

/**
 *
 * @author Panzer01
 */
public class A118EjemploPolimorfismo {
    public static void main(String[] args) {

        A118Empleado emp = new A118Empleado("Juan", 1000);
        imprimirDetalles(emp);

        A118Gerente ger = new A118Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(ger);
    }

    //Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
    //Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    //eso es el polimorfismo, multiples formas pero en tiempo de ejecucion
    public static void imprimirDetalles(A118Empleado emp) {
        System.out.println(emp.obtenerDetalles());
    }

}