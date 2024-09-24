package Model;
import java.util.ArrayList;

public class bibliotecario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private float salario;
    private ArrayList <prestamo> listaPrestamoBibliotecarios = new ArrayList<prestamo>();

    public bibliotecario(String nombre, String cedula, String telefono, String correo, float salario, ArrayList <prestamo> listaPrestamoBibliotecarios) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
        this.listaPrestamoBibliotecarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<prestamo> getListaPrestamoBibliotecarios() {
        return listaPrestamoBibliotecarios;
    }

    public void setListaPrestamoBibliotecarios(ArrayList<prestamo> listaPrestamoBibliotecarios) {
        this.listaPrestamoBibliotecarios = listaPrestamoBibliotecarios;
    }

    @Override
    public String toString() {
        return "bibliotecario [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", correo="
                + correo + ", salario=" + salario + ", listaPrestamoBibliotecarios=" + listaPrestamoBibliotecarios
                + "]";
    }
    
}
