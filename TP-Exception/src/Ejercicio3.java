import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public Ejercicio3() {}

    public static void mostrarElementoArray(Scanner scanner) {

        boolean indiceCorrecto;
        int indiceArray;
        String[] nombresUsuarios = {"Brisa Ortiz", "Rocio Ortiz", "Paola Colino", "Emma Ortiz", "Teodoro Ortiz"};

        do {
            System.out.println("\nIngrese un índice para acceder a los nombres de los usuarios: ");

            try {
                indiceArray = scanner.nextInt();
                String elemento = nombresUsuarios[indiceArray];
                System.out.println("\nEl elemento correspondiente al índice " + indiceArray + " es: " + elemento + "\n");
                indiceCorrecto = true;
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("\nError: Índice fuera de los límites del array. Vuelva a intentarlo\n");
                indiceCorrecto = false;
            }
        }while(!indiceCorrecto);
    }
}
