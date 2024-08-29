package teoria.strings;

public class CadenasDeTexto {
    public static void main(String[] args) {

        int a = 3;
        a = 4;
        String miString = "Hola mundo"; // 0x0001
        String otroString = new String("Hola mundo"); // 0x0002
        String tercerString = "Hola mundo"; // 0x0001

        System.out.println(miString.equals(otroString));

    }
}
