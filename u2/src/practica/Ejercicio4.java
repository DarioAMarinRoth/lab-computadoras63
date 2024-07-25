package practica;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre; // "12"

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(ent.nextLine());
        System.out.println("Ingrese su altura: ");
        altura = Double.parseDouble(ent.nextLine());
        System.out.println("Ingrese su nombre: ");
        nombre = ent.nextLine();

        System.out.println("Mi nombre es " + nombre + " mido " + altura + " metros y tengo " + edad + " años.");

    }
}
