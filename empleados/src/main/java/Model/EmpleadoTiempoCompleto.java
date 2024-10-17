package Model;

public class EmpleadoTiempoCompleto extends Empleado {
    private int salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, int salarioMensual){
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int calcularSalario(){
        int salario = getSalarioMensual();
        return salario;
    }

}
