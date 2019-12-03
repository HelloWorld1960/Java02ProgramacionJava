/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a51_1EntradaSalidaDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Panzer01
 */
public class A148EntradaDatos {
    
    public static void main(String args[]) {
        String captura;
        //InputStreamReader 
        //System.in lee datos de la entrada estandar, es decir la consola de Java, pero solo lle un caracter a la vez.
        InputStreamReader input = new InputStreamReader(System.in);
        //Convertimos input a BufferedReader.
        //BufferedReader para poder leer lineas completas.
        BufferedReader bInput = new BufferedReader(input);
        try {
            System.out.println("Introduce un dato:");
            captura = bInput.readLine();
            while (captura != null) {
                System.out.println("Dato introducido:" + captura);
                captura = bInput.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}