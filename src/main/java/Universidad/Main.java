/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UV");

        Map<Integer, AccionMenu> acciones = new HashMap<>();
        acciones.put(1, new AgregarProfesor());
        acciones.put(2, new RemoverProfesor());
        acciones.put(3, new ListarProfesores());

        int opcion;
        do {
            String menu = "Menú\n"
                    + "1.- Agregar Profesor\n"
                    + "2.- Remover Profesor\n"
                    + "3.- Listar Profesores\n"
                    + "4.- Salir\n";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Elige una opción:"));

            AccionMenu accion = acciones.get(opcion);
            if (accion != null) {
                accion.ejecutar(uni);
            } else if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 4);
    }
}