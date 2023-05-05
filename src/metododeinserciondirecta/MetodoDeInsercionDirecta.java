/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metododeinserciondirecta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jenni
 */
public class MetodoDeInsercionDirecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de números: ");
        int cantidad = lectura.nextInt();
        int[] numeros = new int[cantidad];
//        Random rdm = new Random();

//        for (int i = 0; i < cantidad; i++) {
//            numeros[i] = rdm.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
//        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Número # " + (i+1));
            numeros[i] = lectura.nextInt();
        }
        for (int i = 1; i < numeros.length; i++) {

            int aux = numeros[i];

            int j = i - 1;

            while (j >= 0 && aux < numeros[j]) {

                numeros[j + 1] = numeros[j];

                j--;

            }

            numeros[j + 1] = aux;

        }

        System.out.println("Ordenando numeros ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
