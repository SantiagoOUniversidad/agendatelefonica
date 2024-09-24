package Model;
import java.util.ArrayList;
;

public class detallePrestamo {
    private int cantidad;
    private float subtotal;
    private ArrayList <libro> listaDetallesLibros = new ArrayList<libro>();

    public detallePrestamo(int cantidad, float subtotal, ArrayList <libro> listaDetallesLibros) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.listaDetallesLibros = new ArrayList<>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public ArrayList<libro> getListaDetallesLibros() {
        return listaDetallesLibros;
    }

    public void setListaDetallesLibros(ArrayList<libro> listaDetallesLibros) {
        this.listaDetallesLibros = listaDetallesLibros;
    }
}
