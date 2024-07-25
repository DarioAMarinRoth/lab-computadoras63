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

        if(a != b) {
            System.out.println("Los valores ingresados son distintos.");
        } else {
            System.out.println("Los valores ingresados son iguales.");
        }

        System.out.println("Despues del if");
    }
}


