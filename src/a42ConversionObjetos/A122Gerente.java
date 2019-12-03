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
public class A122Gerente extends A122Empleado{
    //Atributos
    private String departamento;
    //Constructor
    public A122Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo padre heredado
    @Override
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar 
        //el metodo del padre y solo agregar a este metodo de la clase hija
        //esto es invocar un metodo sobreescrito
        //super invoca al metodo de la clase superior que comparta el mismo tipo de parametrización.
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }
    
     public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}