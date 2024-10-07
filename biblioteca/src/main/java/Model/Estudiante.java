package Model;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo); // Llama al constructor de Persona
    }

    @Override
    public String toString() {
        return "Estudiante []";
    }
}
