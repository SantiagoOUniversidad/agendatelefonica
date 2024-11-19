package co.edu.uniquindio.poo.Model;

public class Empleado extends Persona {
    private Boolean bloqueo;

    public Empleado(String nombre, String apellido, String cedula, Boolean bloqueo) {
        super(nombre, apellido, cedula);
        this.bloqueo = bloqueo;
    }

    public Boolean getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(Boolean bloqueo) {
        this.bloqueo = bloqueo;
    }

    @Override
    public String toString() {
        return "Empleado [bloqueo=" + bloqueo + "]";
    }

    
}
