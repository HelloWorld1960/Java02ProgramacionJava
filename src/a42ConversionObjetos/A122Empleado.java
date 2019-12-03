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
public class A122Empleado {
    //Atributos.
    protected String nombre;
    protected double sueldo;
    
    //Constructor sobrecargado.
    protected A122Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Metodos
    public String obtenerDetalles(){
        return "Nombre: " + nombre +
                ", sueldo: " + sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}