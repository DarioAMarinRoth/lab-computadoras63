package teoria.controldeflujo;


import java.util.Scanner;

public class Selecciones {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese un valor para a: ");
        int a = ent.nextInt();
        System.out.println("Ingrese un valor para b: ");
        int b = ent.nextInt();

        System.out.println("Antes del if");

        if(a > b) {
            System.out.println("El valor a es mayor a b.");
        } else if(a < b) {
            System.out.println("El valor a es menor a b");
        } else {
            System.out.println("El valor a es igual a b");
        }

        System.out.println("Despues del if");
    }
}


