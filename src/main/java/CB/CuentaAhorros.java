/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CB;

/**
 *
 * @author johan
 */
public class CuentaAhorros extends CuentaBancaria {
    
    private double tipoInteres;

    public CuentaAhorros(String nombreCliente, String numeroCuenta, double saldoInicial, double tipoInteres) {
        super(nombreCliente, numeroCuenta, saldoInicial);
        this.tipoInteres = tipoInteres;
    }
    
    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
        } else if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado en cuenta de ahorros. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("Error: Saldo insuficiente para realizar el retiro.");
        }
    }
    
    public double getTipoInteres() {
        return tipoInteres;
    }

    @Override
    public String toString() {
        return "--- Cuenta de Ahorros ---\n" +
               super.toString() + "\n" +
               "  > Tipo de Interés: " + tipoInteres + "%";
    }
}
