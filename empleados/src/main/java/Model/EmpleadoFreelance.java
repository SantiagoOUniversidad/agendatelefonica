package Model;

public class EmpleadoFreelance extends Empleado{
    private double proyectosCompletados;
    private int pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String identificacion, double proyectosCompletados, int pagoPorProyecto){
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public double getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(double proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public int getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(int pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public int calcularSalario(){
        int proyectos = (int) getProyectosCompletados();
        int pago = getPagoPorProyecto();
        int pagoTotal = proyectos * pago;
        return pagoTotal;
    }
}
