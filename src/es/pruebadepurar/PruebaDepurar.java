package es.pruebadepurar;

import java.util.Scanner;

public class PruebaDepurar {

    public static void main(String[] args) {
        int tamano;
        int vector[];
        OrdenacionBurbuja ordenacion=new OrdenacionBurbuja();
        
        Scanner consola = new Scanner(System.in);
        System.out.print(INTRODUZCA_NUMERO);
        tamano = consola.nextInt();
        vector = new int[tamano];

        ordenacion.solicitarNumeros(tamano, vector, consola);

        ordenacion.visualizarListado(tamano, vector);

//	
        ordenacion.ordenar(tamano, vector);

        System.out.println("\n");
        System.out.println("El resultado: ");
        ordenacion.visualizarListado(tamano, vector);

    }


    private static final String INTRODUZCA_NUMERO = "Introduzca numero: ";

}
