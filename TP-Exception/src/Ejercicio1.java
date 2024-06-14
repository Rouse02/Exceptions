import java.util.Scanner;

public class Ejercicio1 {

    public Ejercicio1() {}

    public float dividirDosNumeros(Scanner scanner) {

        int primerNumero, segundoNumero;
        float resultadoDivision = 0;
        boolean resultadoValidacion = true;

        do {
            System.out.println("\nIntroduzca el primer numero: ");
            primerNumero = scanner.nextInt();
            System.out.println("\nIntroduzca el segundo numero: ");
            segundoNumero = scanner.nextInt();

            try {
                resultadoDivision = primerNumero / segundoNumero;
                System.out.println("\nEl resultado es: " + resultadoDivision);
            }
            catch (ArithmeticException exception) {
                System.out.println("Error: " + exception.getMessage());
                resultadoValidacion = false;
            }
        }while(!resultadoValidacion);

        return resultadoDivision;
    }
}
