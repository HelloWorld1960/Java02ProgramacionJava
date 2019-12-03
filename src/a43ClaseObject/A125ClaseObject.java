/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a43ClaseObject;

/**
 *
 * @author Panzer01
 */
public class A125ClaseObject {
    public static void main(String[] args) {
        
        A125Empleado emp1 = new A125Empleado("Juan",10000);
        A125Empleado emp2 = new A125Empleado("Juan",10000);
        
        compararObjetos(emp1,emp2);
    }
    
    private static void compararObjetos(A125Empleado emp1, A125Empleado emp2){
        //Llamada metodo toString
        //Por default se manda llamar el metodo toString dentro de println
        System.out.println("Contenido objeto:" + emp1);
        
        //Revision por referencia en memoria
        if( emp1 == emp2)
            System.out.println("Los objetos tiene misma direccion de memoria");
        else
            System.out.println("Los objetos tiene distinta direccion de memoria");
        
        //Revision por el metodo equals
        if(emp1.equals(emp2))
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        else
            System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
        
        //Revisamos el metodo hashCode
        if(emp1.hashCode() == emp2.hashCode())
            System.out.println("Los objetos tienen el mismo codigo hash");
        else
            System.out.println("Los objetos NO tienen el mismo codigo hash");    
    }
}