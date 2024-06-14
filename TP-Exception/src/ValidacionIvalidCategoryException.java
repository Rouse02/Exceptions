public class ValidacionIvalidCategoryException {

    public boolean validarCategoria(String categoria) throws InvalidCategoryException {

        if(categoria.equals("indumentaria")) {
            System.out.println("\nEl impuesto a pagar es del 100%");
            return true;
        }

        if(categoria.equals("tecnologia")) {
            System.out.println("\nEl impuesto a pagar es del 200%");
            return true;
        }

        if(categoria.equals("bazar")) {
            System.out.println("\nEl impuesto a pagar es del 300%");
            return true;
        }

        else throw new InvalidCategoryException("Categoria inválida");
    }
}
