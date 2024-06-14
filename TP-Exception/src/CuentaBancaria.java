import java.util.Scanner;

public class CuentaBancaria {

    //Atributos
    private int nroDeCuenta;
    private Double saldoCuenta;

    //Método constructores
    public CuentaBancaria(int nroDeCuenta, Double saldoCuenta) {
        this.nroDeCuenta = nroDeCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public CuentaBancaria() {
        this.nroDeCuenta = 0;
        this.saldoCuenta = 0.0;
    }

    //Métodos getter y setter
    public int getNroDeCuenta() { return nroDeCuenta; }
    public void setNroDeCuenta(int nroDeCuenta) { this.nroDeCuenta = nroDeCuenta; }

    public Double getSaldoCuenta() { return saldoCuenta; }
    public void setSaldoCuenta(Double saldoCuenta) { this.saldoCuenta = saldoCuenta; }

    //Otros métodos
    public boolean retirarDinero(double valor) {

        boolean retirado;

        try {
            ValidacionSaldoInsuficienteException validacion = new ValidacionSaldoInsuficienteException();
            retirado = validacion.verificarRetiroDinero(valor, this.saldoCuenta);
            this.saldoCuenta -= valor;
            System.out.println("\nRetiro exitoso. Saldo restante: " + this.saldoCuenta);
        }
        catch(SaldoInsuficienteException exception) {
            System.out.println("\nError: " + exception.getMessage());
            retirado = false;
        }
        return retirado;
    }
}

