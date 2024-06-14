import java.util.Scanner;

public class Ejercicio2 {

    public Ejercicio2() {}

    public String pedirCadenaTexto(Scanner scanner) {

        String mensajeUsuario = " ";
        boolean resultadoValidacion;

        do {
            System.out.println("\nIntroduzca una cadena de texto:");
            mensajeUsuario = scanner.nextLine();
            boolean contieneNumeros = mensajeUsuario.matches(".*\\d+.*");

            try {
                if (contieneNumeros) throw new NumberFormatException();
                System.out.println("\nLa longitud de la cadena es: " + mensajeUsuario.length() + "\n");
                resultadoValidacion = true;
            }
            catch (NumberFormatException exception) {
                System.out.println("\nError: La cadena contiene al menos un número. Vuelva a intentarlo\n");
                resultadoValidacion = false;
            }
        }while(!resultadoValidacion);

        return mensajeUsuario;
    }
}
