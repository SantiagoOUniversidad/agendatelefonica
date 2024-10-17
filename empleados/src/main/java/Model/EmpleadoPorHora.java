package Model;

public class EmpleadoPorHora extends Empleado{
    private double horasTrabajadas;
    private int salarioPorHora;

    public EmpleadoPorHora(String nombre, String identificacion, double horasTrabajadas, int salarioPorHora){
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int calcularSalario(){
        int horas = (int) getHorasTrabajadas();
        int salario = getSalarioPorHora();
        int salarioTotal = horas * salario;
        return salarioTotal;
    }
}
