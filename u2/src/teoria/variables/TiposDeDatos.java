package teoria.variables;

public class TiposDeDatos {
    public static void main(String[] args) {
        // Tipos de datos

        // Enteros
        //      - byte: 8 bits  -128;128
        //      - short: 16 bits -32768;32768
        //      - *int: 32 bits   -2147483648;2147483648
        //      - long: 64 bits

        // Flotantes (Reales)
        //      - float: 32 bits
        //      - *double: 64 bits

        // Lógicos
        //      - boolean: true, false

        // Carácter
        //      - char

        // Definir <nombre> Como <Tipo de dato> - En PSeInt

        // <tipo de dato> <nombre>;

        int miEntero;       // Declaramos una variable entera.
        double miFlotante;  // Declaramos una variable de punto flotante.
        boolean miBandera;  // Declaramos una variable lógica.
        char miCaracter;    // Declaramos una variable del tipo carácter.

        miEntero = 10;      // Inicializamos la variable miEntero con 10.
        miFlotante = 1.5;   // Inicializamos la variable miFlotante con 1.5.
        miBandera = true;   // Inicializamos la variable miBandera con el estado true.
        miCaracter = 'j';   // Inicializamos la variable miCaracter con el carácter 'j'.

        // *****************************************************************************

        int otroEntero = 15;    // Declaramos e inicializamos una variable entera con el valor 15.

        String miTexto;         // Declaramos un objeto String para almacenar texto.
        miTexto = "Hola mundo";

        // *****************************************************************************

        System.out.println("El valor de la variable mi entero es: " + miEntero + "\n y el valor de la variable mi flotante es " + miFlotante);
    }
}
