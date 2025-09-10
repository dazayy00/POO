/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CB;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author johan
 */
public class Banco {
    
    private String nombre;
    // Se usa la lista del tipo abstracto 
    //para poder guardar cualquier tipo de cuenta 
    private List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
        System.out.println("Nueva cuenta agregada al banco " + this.nombre);
    }

    public Optional<CuentaBancaria> buscarCuenta(String numeroCuenta) {
        return this.cuentas.stream()
                .filter(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta))
                .findFirst();
    }

    public void listarCuentas() {
        System.out.println("\n===== Cuentas del Banco: " + this.nombre + " =====");
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            for (CuentaBancaria cuenta : cuentas) {
                System.out.println(cuenta.toString());
                System.out.println("-------------------------");
            }
        }
    }
}
