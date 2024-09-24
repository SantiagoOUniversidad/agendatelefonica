package Model;
import java.util.ArrayList;

public class prestamo {
    private String fechaPrestamo;
    private String fechaEntrega;
    private String codigo;
    private float total;
    private ArrayList <detallePrestamo> listaDetallesPrestamos = new ArrayList<detallePrestamo>();
    
    public prestamo(String fechaPrestamo, String fechaEntrega, String codigo, float total,
            ArrayList<detallePrestamo> listaDetallesPrestamos) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.codigo = codigo;
        this.total = total;
        this.listaDetallesPrestamos = listaDetallesPrestamos;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<detallePrestamo> getListaDetallesPrestamos() {
        return listaDetallesPrestamos;
    }

    public void setListaDetallesPrestamos(ArrayList<detallePrestamo> listaDetallesPrestamos) {
        this.listaDetallesPrestamos = listaDetallesPrestamos;
    }

    @Override
    public String toString() {
        return "prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega + ", codigo=" + codigo
                + ", total=" + total + ", listaDetallesPrestamos=" + listaDetallesPrestamos + "]";
    }    
}
