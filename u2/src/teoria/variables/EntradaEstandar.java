// Objetivo: lograr que el usuario ingrese un valor

package teoria.variables;

import java.util.Scanner;

public class EntradaEstandar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Objeto para leer cosas de la entrada éstandar
        int miNumero;
        int otroNumero;

        miNumero = teclado.nextInt();       // Leemos un entero.
        otroNumero = teclado.nextInt();     // Leemos otro entero.

        System.out.println("Los números ingresados fueron: " + miNumero + " y " + otroNumero);

        // Leemos otros tipos de dato

        double miFlotante = teclado.nextDouble();
        boolean miBandera = teclado.nextBoolean();
        String miCadena = teclado.nextLine();
    }
}
