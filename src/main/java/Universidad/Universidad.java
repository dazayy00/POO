/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public boolean removerProfesor(int id) {
        return profesores.removeIf(prof -> prof.getId() == id);
    }

    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores);
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre='" + nombre + "', profesores=" + profesores + "}";
    }
}
