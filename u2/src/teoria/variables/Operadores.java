package teoria.variables;

public class Operadores {
    public static void main(String[] args) {
        // Operadores de asignación para una variable "var" y "valor"

        /*
        var = valor se asigna valora var.
        var += valor -> Equivalente a var = var + valor.
        var -= valor -> Equivalente a var = var - valor.
        var *= valor -> Equivalente a var = var * valor.
        var /= valor -> Equivalente a var = var / valor.
        var %= valor -> Equivalente a var = var % valor.
         */

        // Operadores de incremento y de decremento

        /*
        var++ Primero resuelvo después incremento.
        ++var primero incremento después resuelvo.

        var-- primero resuelvo después decremento.
        --var primero decremento después resuelvo.
         */

        // Operadores aritméticos (entre números y resultan en números)
        /*

        + suma
        - Resta
        * multiplicación
        / División
        % resto o módulo

         */

        // Operadores de comparación (entre números y resultan en boolean)

        /*
        < menor que
        > mayor que
        <= menor o igual
        >= mayor o igual
        == igual
        != distinto
         */

        // Operadores lógicos

        /*
        && AND lógica
        || OR lógica
        ! NOT
        ^ XOR
         */


        int a = 5;
        int b = 3 + ++a;

        System.out.println(b);
        System.out.println(a);
    }
}
