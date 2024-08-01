package practica;

import java.util.Scanner;

public class ExpoEjercicio18 {
    public static void main(String[] args) {

        int numeroMayor;
        int segundoMayor;
        int numeroIngresado;
        int i = 0;

        Scanner leer = new Scanner(System.in);

        // Para evitar problemas con negativos.
        numeroMayor = leer.nextInt();
        segundoMayor = leer.nextInt();

        if (numeroMayor < segundoMayor) {
            int aux = numeroMayor;
            numeroMayor = segundoMayor;
            segundoMayor = aux;
        }

        while (i < 8) {

            numeroIngresado = leer.nextInt();

            if (numeroIngresado > numeroMayor) {
                segundoMayor = numeroMayor;
                numeroMayor = numeroIngresado;
            } else if (numeroIngresado > segundoMayor) {
                segundoMayor = numeroIngresado;
            }

            i++;
        }

        System.out.println("primero");
        System.out.println(numeroMayor);

        System.out.println("segundo");
        System.out.println(segundoMayor);
    }
}
