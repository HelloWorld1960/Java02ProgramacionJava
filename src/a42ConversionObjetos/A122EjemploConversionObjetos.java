/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a42ConversionObjetos;

/**
 *
 * @author Panzer01
 */
public class A122EjemploConversionObjetos {
    public static void main(String[] args) {

        //1. Creamos un tipo de mas alta jerarquia
        A122Empleado empleado;
        //Asignamos una referencia de un objeto de menor jerarquia(UPCASTING)
        //Esto es upcasting, no hay necesidad de una notacion especial
        empleado = new A122Escritor("Roy", 15000, A122TipoEscritura.CLASICO);

        //Sin embargo si quisieramos acceder al detalle de la clase Escritor
        //No es posible, ya que esas caracteristicas no estan en comun
        //entre todas las clases de la jerarquia de clases
        //empleado.getTipoDeEscrituraEnTexto();

        //Imprimimos los detalles en un metodo generico
        imprimirDetalles(empleado);

        //2. Podemos hacer lo mismo con la clase Gerente
        //Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new A122Gerente("Laura", 18000, "Sistemas");

        //Pero si queremos acceder directo por la variable empleado 
        //al detalle del objeto Gerente no es posible, se pierde el acceso
        //empleado.getDepartamento();

        //Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);
    }

    //Metodo generico para imprimir los detalles de la jerarquia Empleado
    //A122Empleado empleado = new A122Escritor("Roy", 15000, A122TipoEscritura.CLASICO);
    //A122Empleado empleado = new A122Gerente("Laura", 18000, "Sistemas");
    private static void imprimirDetalles(A122Empleado empleado) {

        String resultado = null;

        //Imprimir detalles es general para todos ya que es por polimorfismo
        //no se necesita de ninguna conversion
        System.out.println("\nDetalle:" + empleado.obtenerDetalles());

        //Pero los detalles de cada clase debemos hacer un Downcasting
        if (empleado instanceof A122Escritor) {
            //Convertimos el objeto al tipo inferior deseado
            //Convierte objeto  - Downcasting
            A122Escritor escritor = (A122Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la clase Escritor 
            resultado = escritor.getTipoDeEscrituraEnTexto();

            //Otra forma es hacer la conversion en la misma linea de codigo.
            //Esto es muy comun encontrarlo en Java 
            //para evitar la creacion de variables innecesarias
            resultado = ((A122Escritor) empleado).tipoEscritura.getDescripcion();

            System.out.println("resultado tipoEscritura:" + resultado);

        } else if (empleado instanceof A122Gerente) {
            //Hacemos el downcasting en la misma linea de codigo
            //nos ahorramos una variable
            resultado = ((A122Gerente) empleado).getDepartamento();

            System.out.println("resultado departamento:" + resultado);
        }
    }
}