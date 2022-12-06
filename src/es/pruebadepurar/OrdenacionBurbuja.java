/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pruebadepurar;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class OrdenacionBurbuja {

    public void ordenar(int tamano, int[] vector) {
        int aux;
        for (int i = 0; i < tamano; i++) {
            for (int j = i + 1; j < tamano; j++) {
                if (vector[j] < vector[i]) {
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
    }

    public void visualizarListado(int tamano, int[] vector) {
        for (int i = 0; i < tamano; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    
        public static void solicitarNumeros(int tamano, int[] vector, Scanner consola) {
        for (int i = 0; i < tamano; i++) {
            System.out.println((i + 1) + " Número?");
            vector[i] = consola.nextInt();
        }
    }
}
