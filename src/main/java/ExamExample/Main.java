/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamExample;

/**
 *
 * @author johan
 */
public class Main {

    public static void main(String[] args) {
        Hackathon hackathonv = new Hackathon (" Concurso del golfo ", " Veracruz ");
        hackathonv.IniciarTorneo();
        hackathonv.agregarPatrocinador("Tiendas neto", "Becas", "10 laptops", "Difusion");
        hackathonv.agregarPatrocinador("Carnes cadena", "Espacios", "20 celilares", "Difusion");
        
        Participantes p1 = new Participantes("Valeria ", "4546551");
        Participantes p2 = new Participantes("Johan ", "5465");
        Participantes p3 = new Participantes("David ", "4546");
        Participantes p4 = new Participantes("Adolfo ", "72121");
        
        Mentor mentor = new Mentor (45, "Lic cachetes");
        Mentor mentor2 = new Mentor (46, "Lic pomulos prominentes");
        
        Equipo equipo1 = new Equipo("Unisecx", "Desarrollo de app contra cancer de mama");
        
        equipo1.agregarParticipantes(p4);
        equipo1.agregarParticipantes(p3);
        equipo1.asignarMentor(mentor);
        
        Equipo equipo2 = new Equipo("toritos sexys", "me da wewencha");
        
        equipo2.agregarParticipantes(p2);
        equipo2.agregarParticipantes(p1);
        equipo2.asignarMentor(mentor2);
        
        hackathonv.inscribirEquipo(equipo2);
        hackathonv.inscribirEquipo(equipo1);
        
        System.out.println("----- Iniciando Simulación del Hackathon -----");
        hackathonv.mostrarInfo();
        System.out.println("\n----- Acciones de los Equipos -----");
        equipo1.desarrollar();
        equipo2.desarrollar();
        
        hackathonv.FinalizarTorneo();
    }
    
}
