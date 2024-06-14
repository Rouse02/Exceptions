public class ValidacionIvalidPasswordException {

    public ValidacionIvalidPasswordException() {}


    public boolean validarContrasenia(String password) throws InvalidPasswordException {

        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*")) return true;
        else throw new InvalidPasswordException("La contraseña debe contener al menos 8 caracteres, una mayúscula y un número");
    }
}
