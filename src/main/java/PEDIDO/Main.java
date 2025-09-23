/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PEDIDO;

/**
 *
 * @author johan
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("🚀 Iniciando sistema de demostración de pedidos...");
        Tienda miTienda = new Tienda();
        Pedido pedido = new Pedido("FOLIO-DEMO-001");


        System.out.println("\n===== 1. ESTADO INICIAL DEL SISTEMA =====");
        miTienda.mostrarInventario();
        pedido.mostrarDetalles();


        System.out.println("\n===== 2. AGREGANDO PRODUCTOS AL PEDIDO =====");
        
        miTienda.buscarProductoPorCodigo("TEC-01").ifPresent(laptop -> {
            pedido.agregarLinea(laptop, 1);
        });

        miTienda.buscarProductoPorCodigo("VID-04").ifPresent(juego -> {
            pedido.agregarLinea(juego, 2);
        });

        pedido.mostrarDetalles();

        
        System.out.println("\n===== 3. REMOVIENDO UN PRODUCTO DEL PEDIDO =====");
        boolean fueRemovido = pedido.removerLineaPorCodigo("VID-04");
        if (fueRemovido) {
            System.out.println("-> Producto con código 'VID-04' fue removido exitosamente.");
        }
        
        pedido.mostrarDetalles();


        System.out.println("\n===== 4. CANCELANDO EL PEDIDO =====");
        pedido.cancelar();
        System.out.println("-> El pedido ha sido cancelado.");
        pedido.mostrarDetalles();
    }
}