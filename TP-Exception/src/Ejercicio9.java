import java.util.Scanner;

public class Ejercicio9 {

    public Ejercicio9() {}

    public boolean validarContraseña(Scanner scanner) {

        boolean validacionPassword = true;

        try {
            System.out.println("\nIntroduzca el password");
            String password = scanner.nextLine();

            ValidacionIvalidPasswordException validacionContrasenia = new ValidacionIvalidPasswordException();
            validacionPassword = validacionContrasenia.validarContrasenia(password);
            System.out.println("\nLa contraseña es: " + password);
        }
        catch(InvalidPasswordException exception) {
            System.out.println("\nError: " + exception.getMessage());
            validacionPassword = false;
        }
        return validacionPassword;
    }
}
