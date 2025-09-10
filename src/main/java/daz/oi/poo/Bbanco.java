/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daz.oi.poo;

import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class Bbanco {

    public static void main(String[] args) {
        
        ArrayList<Banco> cuentasDelBanco = new ArrayList<>();
        System.out.println("🏦 Sistema bancario iniciado. No hay cuentas registradas.");
        
        
        System.out.println("\n--- Creando y añadiendo cuentas ---");
        cuentasDelBanco.add(new Banco("Dr. Adolfo Rodríguez", "1111-2222-7894-9685", 2500.75, 2.5));
        cuentasDelBanco.add(new Banco("Ana García", "3333-4444-5645-2319", 5000.00, 1.8));
        cuentasDelBanco.add(new Banco("Luis Martínez", "5555-6666-8841-0012", 12350.40, 3.1));
        System.out.println("Se han añadido " + cuentasDelBanco.size() + " cuentas nuevas.");
        
        System.out.println("\n--- Reporte de Cuentas del Banco ---");
        for (Banco cuenta : cuentasDelBanco) {
            System.out.println("------------------------------------");
            System.out.println("Titular: " + cuenta.getNombre());
            System.out.println("Cuenta: " + cuenta.getCuenta());
            System.out.println("Saldo: $" + cuenta.getSaldo());
        }
        System.out.println("------------------------------------");
        
        
        System.out.println("\n--- Realizando operaciones en la cuenta de Ana García ---");
        Banco cuentaDeAna = cuentasDelBanco.get(1);
        cuentaDeAna.ingreso(150.00);
        cuentaDeAna.reintegro(700.00); 
        
        System.out.println("\n--- Estado final de la cuenta de Ana García ---");
        System.out.println("Titular: " + cuentaDeAna.getNombre());
        System.out.println("Nuevo Saldo: $" + cuentaDeAna.getSaldo());
        
        
        //Banco mibanco = new Banco();
        
        //mibanco.setNombre("Johan david baltazar trinidad");
        //mibanco.setCuenta("4567-4569-1236-9685");
        //mibanco.setTipoDeInteres(2.5);
        
        //System.out.println("---Datos de la cuenta---");
        //System.out.println("Titular: "+ mibanco.getNombre());
        //System.out.println("Numero de cuenta: "+ mibanco.getCuenta());
        //System.out.println("Tipo de interes: "+ mibanco.getTipoDeInteres() +"%");
        //System.out.println("Saldo inicial: $" + mibanco.getSaldo());
        //System.out.println("-------------------------- \n");
        
        //System.out.println("--- Realizando Operaciones ---");
        //mibanco.ingreso(2500.75);
        //mibanco.reintegro(300.50);
        //mibanco.reintegro(5000.00);
        //mibanco.ingreso(-100.00); 
        //System.out.println("----------------------------\n");
        
        //System.out.println("Saldo final de la cuenta: $" + mibanco.getSaldo());
    }
    
}
