package teoria;



public class PrimeraFuncion {

    public static void main(String[] args) {
        int resultado = sumar(2,3);
        resultado = resultado + 2;
        System.out.println(resultado);
    }

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


}
