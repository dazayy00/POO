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

public class AgregarProfesor implements AccionMenu {
    @Override
    public void ejecutar(Universidad uni) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu Id:"));
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        Profesor nuevo = new Profesor(id, nombre);
        uni.agregarProfesor(nuevo);
        JOptionPane.showMessageDialog(null, "Profesor agregado con éxito.");
    }
}
