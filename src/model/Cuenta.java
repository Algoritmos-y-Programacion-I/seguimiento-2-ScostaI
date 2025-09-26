package model;
import TipoCuenta;

public class Cuenta {
    private String nombreBanco;
    private TypeCuenta tipoCuenta;
    private double saldoActual;

    public Cuenta (String nombreBanco, TypeCuenta tipoCuenta, double saldoActual){
        this.nombreBanco=nombreBanco;
        this.tipoCuenta=tipoCuenta;
        this.saldoActual=saldoActual;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public TypeCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setTipoCuenta(double tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public depositarDineroCuenta(double monto) {
        this.saldoActual = this.saldoActual + monto;
    }

    public retirarDineroCuenta(double monto) {
        if( (saldoActual-monto) < 0) {
            System.out.println("No hay tanta plata")
        }
    }
}