import java.util.Scanner;

public class Ejercicio8 {

    //Categorías: Bazar, Indumentaria, Tecnologia

    public Ejercicio8() {}

    public boolean calcularImpuestoPorCategoria(Scanner scanner)  {

        boolean categoriaValida = true;

        try {
            System.out.println("\nIngrese una categoria: ");
            String categoria = scanner.nextLine().toLowerCase();

            ValidacionIvalidCategoryException validacionCategoria = new ValidacionIvalidCategoryException();
            categoriaValida = validacionCategoria.validarCategoria(categoria);
        }
        catch (InvalidCategoryException exception) {
            System.out.println("\nError: " + exception.getMessage());
            categoriaValida = false;
        }
        return categoriaValida;
    }
}
