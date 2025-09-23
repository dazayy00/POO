/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEDIDO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author johan
 */
public class Tienda {
    private final List<Producto> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
        cargarInventarioInicial();
    }

    public Optional<Producto> buscarProductoPorCodigo(String codigo) {
        return inventario.stream()
                         .filter(p -> p.getCodigoDeProducto().equalsIgnoreCase(codigo))
                         .findFirst();
    }
    
    private void cargarInventarioInicial() {
        inventario.add(new ProductoFisico("TEC-01", "Laptop Gamer", 25000.0, 2.5));
        inventario.add(new ProductoFisico("HOG-02", "Cafetera Express", 3500.0, 3.0));
        inventario.add(new ProductoDigital("SOFT-03", "Licencia Antivirus (1 año)", 800.0, 50.0));
        inventario.add(new ProductoDigital("VID-04", "Juego 'Cyberpunk 2077'", 1200.0, 70000.0));
    }
    
    public void mostrarInventario() {
        System.out.println("--- Inventario de la Tienda ---");
        for (Producto p : inventario) {
            System.out.println(p.obtenerDetalles());
        }
    }
}
