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
public enum A122TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    private A122TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}