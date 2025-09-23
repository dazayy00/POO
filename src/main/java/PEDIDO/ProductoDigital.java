/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEDIDO;

/**
 *
 * @author johan
 */
public class ProductoDigital extends Producto {
    private final double tamanoMb;

    public ProductoDigital(String codigoDeProducto, String nombre, double precioUnitario, double tamanoMb) {
        super(codigoDeProducto, nombre, precioUnitario);
        this.tamanoMb = tamanoMb;
    }

    @Override
    public String obtenerDetalles() {
        return super.toString() + ", Tamaño: " + tamanoMb + " MB";
    }
}
