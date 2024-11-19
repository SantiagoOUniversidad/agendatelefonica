package co.edu.uniquindio.poo.Model;

public class Administrador extends Persona {
    private String claveIngreso;
    public Administrador(String nombre, String apellido, String cedula, String claveIngreso) {
        super(nombre, apellido, cedula);
        this.claveIngreso = claveIngreso;
    }
    public String getClaveIngreso() {
        return claveIngreso;
    }
    public void setClaveIngreso(String claveIngreso) {
        this.claveIngreso = claveIngreso;
    }
    @Override
    public String toString() {
        return "Administrador [claveIngreso=" + claveIngreso + "]";
    }

    
}
