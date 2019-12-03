/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a51_1EntradaSalidaDatos;

import java.util.Scanner;

/**
 *
 * @author Panzer01
 */
public class A149EntradaDatosScanner {
    public static void main(String[] args) {
        String captura = null;
        /*System.in lee datos de la entrada estandar, es decir la consola de Java, pero solo lle un caracter a la vez.
          La clase Scanner contiene metodos para simplificar la lectura de la entrada de datos.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un dato:");
        captura = scan.nextLine();
        while (captura != null) {
            System.out.println("Dato introducido:" + captura);
            captura = scan.nextLine();
        }
    }
}