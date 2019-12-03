/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a51_2EntradaSalidaDatosCalculadora;

import static a51_2EntradaSalidaDatosCalculadora.A150Operaciones.sumar;
import java.util.Scanner;

/**
 *
 * @author Panzer01
 */
public class A150CalculadoraEntradaDatos {
    
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//almacenamos un dato de tipo entero
        System.out.println("Proporciona el segundo valor:");
        int b = scan.nextInt();//almacenamos un dato de tipo entero
        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es:" + resultado);
        
    }
}