public class ValidacionSaldoInsuficienteException {

    public ValidacionSaldoInsuficienteException() {}

    public static boolean verificarRetiroDinero(Double valor, Double saldoCuenta) throws SaldoInsuficienteException {

        if(saldoCuenta < valor) throw new SaldoInsuficienteException("El monto a retirar supera el dinero en cuenta");

        else return true;
    }
}