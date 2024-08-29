package practica;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        int contadorDeVocales = 0;
        String cadenaIngresada;
        String aux;
        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto");
        cadenaIngresada = ent.nextLine();
        aux = cadenaIngresada.toLowerCase();
        // String: Cadena de caracteres
        // Hola mundo -> {'H', 'o', 'l', 'a', ' ', 'm', ...} Longitud: 10

        for (int i = 0; i < aux.length(); i++) {
            if (esVocal(aux.charAt(i))) {
                contadorDeVocales++;
            }
        }

        System.out.println(contadorDeVocales);

    }

    public static boolean esVocal(char caracter) {

        return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');

    }

}
