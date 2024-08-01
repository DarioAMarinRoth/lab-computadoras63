package practica;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        double promedio;
        int numeroIngresado;
        double sumaPares = 0;
        int contadorPares = 0;

        Scanner ent = new Scanner(System.in);

        for(int i = 0; i < 10 ; i++) {
            numeroIngresado = ent.nextInt();

            if (numeroIngresado % 2 == 0) {
                sumaPares += numeroIngresado;
                contadorPares++;
            }
        }

        promedio = sumaPares / contadorPares;
        System.out.println(promedio);
    }
}
