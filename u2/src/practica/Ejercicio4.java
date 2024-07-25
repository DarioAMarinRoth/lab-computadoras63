package practica;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre;

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        edad = ent.nextInt();
        System.out.println("Ingrese su altura: ");
        altura = ent.nextDouble();
        System.out.println("Ingrese su nombre: ");
        ent.nextLine();
        nombre = ent.nextLine();

        System.out.println("Mi nombre es " + nombre + " mido " + altura + " metros y tengo " + edad + " años.");

    }
}
