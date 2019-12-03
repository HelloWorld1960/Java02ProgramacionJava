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
public class A125Empleado {
    //Atributos
    private String nombre;
    private double sueldo;

    //Constructor de tipo default o package(solo accesible en el paquete).
    A125Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Metodos
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

    /*Metodo heredado de la clase Object.
      Sobreescribimos este metodo para mostrar la informacion completa del objeto.*/
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + this.nombre + ", sueldo=" + this.sueldo + '}';
    }
    
    /*Metodo heredado de la clase Object.
      Sobreescribimos este metodo para saber si dos objetos son del mismo tipo y tienen los mismos datos. 
      Nos dara el valor true si son iguales y false si no.*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return (false);
        }
        /*Dado que se recibe como argumento un tipo Object de mayor jerarquia, se tiene que hacer un downcasting para 
        acceder a los atributos y metodos de la clase de menor jerarquia.
        Double.valueOf(String) devolverá un objeto contenedor de tipo Double.*/
        if (obj instanceof A125Empleado) {
            A125Empleado emp = (A125Empleado) obj;//downcasting
            if (this.nombre.equals(emp.nombre) && Double.valueOf(this.sueldo).equals(emp.sueldo)) {
                return (true);
            } else {
                return (false);
            }
        } else {
            return (false);
        }
    }

    /*Metodo heredado de la clase Object.
      Sobreescribimos este metodo para compruobar si los dos objetos son del mismo tipo y si su nombre coincide.
      En tal caso el resultado será  true y en todos los demás false.*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode();
        hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
        return hash;
    }
}