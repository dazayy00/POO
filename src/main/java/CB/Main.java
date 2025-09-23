/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CB;

/**
 *
 * @author johan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco miBanco = new Banco("Banco Azteca");

        CuentaBancaria cuenta1 = new CuentaAhorros("Adolfo Parada", "12345-AH", 1000.0, 2.5);
        CuentaBancaria cuenta2 = new CuentaCorriente("Johan Baltazar", "67890-CC", 500.0, 200.0);

        miBanco.agregarCuenta(cuenta1);
        miBanco.agregarCuenta(cuenta2);

        miBanco.listarCuentas();

        
        //empieza el polimorfismo
        System.out.println("\n===== Realizando Operaciones =====");
        
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.retirar(1500);

        System.out.println("-------------------------");

        cuenta2.depositar(100);
        cuenta2.retirar(700);
        cuenta2.retirar(200);
        
        miBanco.listarCuentas();
    }
    
}
