/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daz.oi.poo;

/**
 *
 * @author johan
 */
public class Banco {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    public Banco() {
        
    }
    
    public Banco(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoDeInteres = tipo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    //public void setSaldo(double saldo) {
        //this.saldo = saldo;
    //}
    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres= tipoDeInteres;
    }
    
    
    public String getNombre() {
        return this.nombre;
    }
    public String getCuenta() {
        return this.cuenta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double getTipoDeInteres(){
        return this.tipoDeInteres;
    }
    
    public void ingreso(double cantidad){
        if (cantidad < 0) {
            System.out.println("error: no se puede ingresar una cantidad negativa");
        } else {
            this.saldo += cantidad;
            System.out.println(" ingreso de $ "+ cantidad + " realizado con exito ");
        }
    }
    
    public void reintegro(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: No se puede retirar una cantidad negativa.");
        } else if (this.saldo < cantidad) {
            System.out.println("Error: Fondos insuficientes para el retiro.");
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado con éxito.");
        }
    }
}
