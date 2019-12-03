/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a39Overriding;

/**
 *
 * @author Panzer01
 */
public class A116Gerente extends A116Empleado {
    /*Atributos*/
    private String departamento;
    /*Constructor sobrecargado*/
    public A116Gerente(String nombre, double sueldo, String departamento) {
        //Accediendo al constructor protegido de la A116Empleado, al ser una subclase puede acceder aunque este en otro paquete.
        //super invoca al constructor de la clase superior que comparta el mismo tipo de parametrización.
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        //Observar como accedemos directamente al atributo heredado
        //debido a que se declaro como protected en la clase padre
        //y por tanto la clase hija lo hereda y accede directamente
        return "Nombre: " + nombre +
                ", sueldo: " + sueldo +
                ", departamento: " + departamento;
    }
    
     public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}