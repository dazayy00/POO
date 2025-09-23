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

public class RemoverProfesor implements AccionMenu {
    @Override
    public void ejecutar(Universidad uni) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id del profesor a remover: "));
        boolean eliminado = uni.removerProfesor(id);

        String mensaje = eliminado ? "Profesor eliminado con éxito" : "No se encontró al profesor";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
