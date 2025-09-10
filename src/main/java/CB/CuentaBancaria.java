/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CB;

/**
 *
 * @author johan
 */
//cuenta abstracta
public abstract class CuentaBancaria {
    
    protected String nombreCliente;
    protected String numeroCuenta;
    protected double saldo;
    
    
    public CuentaBancaria(String nombreCliente, String numeroCuenta, double saldoInicial) {
       this.nombreCliente = nombreCliente;
       this.numeroCuenta = numeroCuenta;
       this.saldo = saldoInicial;
    }
     
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    
    public abstract void retirar(double cantidad);


    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "  > Cliente: " + nombreCliente + "\n" +
               "  > Cuenta: " + numeroCuenta + "\n" +
               "  > Saldo: $" + saldo;
    }
}
