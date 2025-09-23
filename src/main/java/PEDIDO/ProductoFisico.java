/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEDIDO;

/**
 *
 * @author johan
 */
public class ProductoFisico extends Producto {
    private final double pesoKg;
    public ProductoFisico(String codigoDeProducto, String nombre, double precioUnitario, double pesoKg) {
        super(codigoDeProducto, nombre, precioUnitario);
        this.pesoKg = pesoKg;
    }

    @Override
    public String obtenerDetalles() {
        return super.toString() + ", Peso: " + pesoKg + " kg";
    }
}