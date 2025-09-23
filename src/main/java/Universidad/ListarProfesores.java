/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class ListarProfesores implements AccionMenu {
    @Override
    public void ejecutar(Universidad uni) {
        StringBuilder nombres = new StringBuilder();
        for (Profesor p : uni.getProfesores()) {
            nombres.append(p).append("\n");
        }
        String mensaje = nombres.isEmpty() ? "No hay profesores" : nombres.toString();
        JOptionPane.showMessageDialog(null, mensaje);
    }
}