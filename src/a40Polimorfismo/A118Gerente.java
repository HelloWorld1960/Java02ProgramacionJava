/*
 * Clase hija que hereda de la clase padre A118Empleado.
 */
package a40Polimorfismo;

/**
 *
 * @author Panzer01
 */
public class A118Gerente extends A118Empleado{
    /*Atributos*/
    private String departamento;
    /*Constructor sobrecargado*/
    public A118Gerente(String nombre, double sueldo, String departamento) {
        //Accediendo al constructor protegido de la A118Empleado, al ser una subclase puede acceder aunque este en otro paquete.
        //super invoca al constructor de la clase superior que comparta el mismo tipo de parametrización.
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    /*Metodos*/
    //Sobreescribimos el metodo padre heredado.
    @Override
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar 
        //el metodo del padre y solo agregar a este metodo de la clase hija
        //esto es invocar un metodo sobreescrito.
        //En este caso super funciona como this pero apuntando al metodo de la clase padre.
        return (super.obtenerDetalles() + ", departamento: " + departamento);
    }
    
     public String getDepartamento() {
        return (departamento);
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}