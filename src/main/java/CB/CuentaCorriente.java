/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CB;

/**
 *
 * @author johan
 */
public class CuentaCorriente extends CuentaBancaria {
    
    private double limiteSobregiro;

    public CuentaCorriente(String nombreCliente, String numeroCuenta, double saldoInicial, double limiteSobregiro) {
        super(nombreCliente, numeroCuenta, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
        } else if (cantidad <= this.saldo + this.limiteSobregiro) {
            this.saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado en cuenta corriente. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("Error: Límite de sobregiro excedido.");
        }
    }

    @Override
    public String toString() {
        return "--- Cuenta Corriente ---\n" +
               super.toString() + "\n" +
               "  > Límite de Sobregiro: $" + limiteSobregiro;
    }
    
}
