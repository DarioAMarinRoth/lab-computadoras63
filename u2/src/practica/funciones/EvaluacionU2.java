package practica.funciones;

public class EvaluacionU2 {

    public static void main(String[] args) {
        System.out.println(esPotencia(64, 2));
    }

    public static boolean esPotencia(int num1, int num2) {
        int res;
        int i = 0;

        do {
            res = (int) Math.pow(num2, i);
            i++;
        } while (res < num1);

        return num1 == res;
    }
}
