package practica.funciones;

public class Funciones {

    public static void contarHasta(int valorInicial, int valorFinal) {

        if (valorFinal < valorInicial) {
            System.out.println("Error: el valor final es mayor al valor inicial y no se puede realizar la cuenta.");
        } else {
            System.out.println("Comenzando la cuenta");

            for (int i = valorInicial; i <= valorFinal; i++){
                System.out.println(i);
            }
            System.out.println("Terminó la cuenta");
        }
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
    }

    public static double potencia(double base, int exponente){
        
        double potencia = 1;

        if (exponente < 0) {
            exponente *= -1;
            potencia = potencia(base, exponente);
            return 1 / potencia;
        }

        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
        }

        return potencia;
    }

    public static int factorialViejaEscuela(int n) {

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return  1;
        }
    }
}
