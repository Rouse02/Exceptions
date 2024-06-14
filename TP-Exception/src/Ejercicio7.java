import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.Period;

public class Ejercicio7 {

    public Ejercicio7() {}

    public void pedirFechaNacimiento(Scanner scanner) {

        String dateString;
        do {
            System.out.println("\nPor favor, introduce una fecha en formato yyyy-MM-dd:");
            dateString = scanner.nextLine();
        }while(!validaFechaNacimiento(dateString));
    }

    public boolean validaFechaNacimiento(String fechaNacimiento) {

        boolean fechaCorrecta = true;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
            LocalDate.parse(fechaNacimiento, formatter);
            System.out.println("\nSu fecha de nacimiento es: " + fechaNacimiento);
            int edad = calcularEdad(fechaNacimiento);
            System.out.println("\nSu edad es: " + edad + " años");
        }
        catch (DateTimeParseException exception) {
            System.out.println("\nError: " + exception.getMessage());
            fechaCorrecta = false;
        }
        return fechaCorrecta;
    }

    public int calcularEdad(String fechaNacimientoStr) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

}
