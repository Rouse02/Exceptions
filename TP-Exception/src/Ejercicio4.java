import javax.sound.midi.spi.SoundbankReader;
import java.util.Scanner;

public class Ejercicio4 {

    public Ejercicio4() {}

    public static void mostrarAreaCirculo(Scanner scanner) {

        boolean numeroValido;
        double radioCirculo, areaCirculo;

        do {
            System.out.println("\nIngrese el radio del círculo");
            try {
                radioCirculo = scanner.nextDouble();
                areaCirculo = Math.PI *  Math.pow(radioCirculo, 2);
                System.out.println("\nEl radio del círculo es: " + radioCirculo + "\nEl área del círculo es: " + areaCirculo);
                numeroValido = true;
            }
            catch(IllegalArgumentException exception) {
                System.out.println("No se permiten valores negativos. Vuelva a intentarlo");
                numeroValido = false;
            }
        }while(!numeroValido);
    }
}
