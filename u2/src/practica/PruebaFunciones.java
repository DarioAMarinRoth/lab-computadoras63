package practica;

import static practica.funciones.Funciones.potencia;

public class PruebaFunciones {
    public static void main(String[] args) {

        double miPotencia = Math.pow(2, 2);

        double resultado = potencia(2, -2);
        System.out.println(miPotencia);
    }
}
