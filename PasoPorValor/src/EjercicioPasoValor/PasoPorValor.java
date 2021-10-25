package EjercicioPasoValor;

public class PasoPorValor {

    public static void main(String[] args) {
       
        var a = 10;
        System.out.println("a = " + a);
        cambioValor(a);
        System.out.println("Fin del programa");
    }

    private static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        System.out.println("arg1 = " + arg1);
    }
    
}