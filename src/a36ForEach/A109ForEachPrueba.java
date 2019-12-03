package a36ForEach;

/**
 *
 * @author Panzer01
 */
public class A109ForEachPrueba {
    public static void main(String[] args) {

        //Creamos un arreglo de Personas
        A109Persona[] personas = {new A109Persona("Juan"), new A109Persona("Karla")};

        //Iteramos cada elemento del arreglo de personas
        for (A109Persona p : personas) {
            //Accedemos a las propiedades y/o metodos del objeto 
            String nombre = p.getNombre();
            System.out.println("Nombre persona:" + nombre);
        }

        System.out.println("");
        //Creamos un arreglo de enteros
        int[] edades = {15, 20, 41, 50};
        //Iteramos el arreglo
        for(int edad : edades){
            System.out.println("Edad:" + edad);
        }
    }
}