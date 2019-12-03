/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a45InterfacesPrueba;

import a45Interfaces.A129AccesoDatos;
import a45Interfaces.A129ImplementacionMySQL;
import a45Interfaces.A129ImplementacionOracle;

/**
 *
 * @author Panzer01
 */
public class A129ManejoInterfaces {
     public static void main(String[] args) {

        A129AccesoDatos datos = new A129ImplementacionOracle(); //Polimorfismo aplicando UpCasting
        ejecutar(datos,"listar");
        
        datos = new A129ImplementacionMySQL(); //Polimorfismo aplicando UpCasting
        ejecutar(datos,"insertar");
    }
    
    //De tipo estatic, debido a que es llamda dentro de un metodo estatic.
    private static void ejecutar(A129AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            datos.listar();
        }
        else if("insertar".equals(accion)){
            datos.insertar();
        }
    }

}