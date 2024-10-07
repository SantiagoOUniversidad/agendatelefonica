package Model;

public class Bibliotecario extends Persona {
    private double salario;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo); // Llama al constructor de Persona
        this.salario = salario;
    }

    // Getter y setter de salario
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
