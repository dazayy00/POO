/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEDIDO;

/**
 *
 * @author johan
 */
public abstract class Producto {
    protected String codigoDeProducto;
    protected String nombre;
    protected double precioUnitario;

    public Producto(String codigoDeProducto, String nombre, double precioUnitario) {
        this.codigoDeProducto = codigoDeProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigoDeProducto() {
        return codigoDeProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public abstract String obtenerDetalles();

    @Override
    public String toString() {
        return "Código: " + codigoDeProducto + ", Nombre: " + nombre + ", Precio: $" + precioUnitario;
    }
}