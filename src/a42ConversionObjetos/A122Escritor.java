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
public class A122Escritor extends A122Empleado{
    //Utilizamos una enumeracion para las opciones de tipo de escritura
    final A122TipoEscritura tipoEscritura;

    public A122Escritor(String nombre, double sueldo, A122TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar 
        //el metodo del padre y solo agregar a este metodo lo de la clase hija
        //esto es invocar un metodo sobreescrito
        //super invoca al metodo de la clase superior que comparta el mismo tipo de parametrización.
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public A122TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }

}