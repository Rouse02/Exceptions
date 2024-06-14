public class Ejercicio6 {

    public Ejercicio6() {}

    public static double calcularFactorial(int nro) {

        if(nro < 0) throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");

        if(nro == 0) return 1;

        else return nro * calcularFactorial(nro - 1);
    }
}
