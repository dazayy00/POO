/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEDIDO;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author johan
 */

public class Pedido {
    private final String folio;
    private final ArrayList<LineaPedido> lineas;

    public Pedido(String folio) {
        this.folio = folio;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(Producto producto, int cantidad) {
        if (producto != null && cantidad > 0) {
            lineas.add(new LineaPedido(producto, cantidad));
            System.out.println("-> Producto '" + producto.getNombre() + "' agregado al pedido.");
        }
    }

    public boolean removerLineaPorCodigo(String codigo) {
        Optional<LineaPedido> lineaParaRemover = lineas.stream()
                .filter(linea -> linea.getProducto().getCodigoDeProducto().equalsIgnoreCase(codigo))
                .findFirst();

        if (lineaParaRemover.isPresent()) {
            lineas.remove(lineaParaRemover.get());
            return true;
        }
        return false;
    }

    public double calcularTotal() {
        return lineas.stream()
                     .mapToDouble(LineaPedido::getSubtotal)
                     .sum();
    }

    public void cancelar() {
        lineas.clear();
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles del Pedido: " + this.folio + " ---");
        if (lineas.isEmpty()) {
            System.out.println("El pedido está vacío.");
        } else {
            for (LineaPedido linea : lineas) {
                System.out.println(
                    "> " + linea.getProducto().obtenerDetalles() +
                    ", Cantidad: " + linea.getCantidad() +
                    ", Subtotal: $" + linea.getSubtotal()
                );
            }
            System.out.println("---------------------------------");
            System.out.println("TOTAL: $" + this.calcularTotal());
        }
    }
}