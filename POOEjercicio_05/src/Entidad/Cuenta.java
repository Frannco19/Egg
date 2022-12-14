package Entidad;


public class Cuenta {
    
    private int numeroCuenta;
    private long DniCliente;
    private int saldoActual;
    private int interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DniCliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DniCliente = DniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(long DniCliente) {
        this.DniCliente = DniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    
    
}

