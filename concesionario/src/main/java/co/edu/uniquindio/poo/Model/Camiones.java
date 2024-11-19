package co.edu.uniquindio.poo.Model;

public class Camiones extends Vehiculo {
    private double pasajeros;
    private double numeroPuertas;
    private double capacidadMaletero;
    private Boolean AC;
    private Boolean abs;
    private Boolean frenosAire;
    private double ejes;
    
    public Camiones(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
            double cambios, double velocidadMax, double cilindraje, double pasajeros, double numeroPuertas,
            double capacidadMaletero, Boolean aC, Boolean abs, Boolean frenosAire, double ejes, String placa) {
        super(tipoCombustible, tipoCaja, estado, marca, modelo, cambios, velocidadMax, cilindraje, placa);
        this.pasajeros = pasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        AC = aC;
        this.abs = abs;
        this.frenosAire = frenosAire;
        this.ejes = ejes;
    }

    public double getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(double pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(double numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public Boolean getAC() {
        return AC;
    }

    public void setAC(Boolean aC) {
        AC = aC;
    }

    public Boolean getAbs() {
        return abs;
    }

    public void setAbs(Boolean abs) {
        this.abs = abs;
    }

    public Boolean getFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(Boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public double getEjes() {
        return ejes;
    }

    public void setEjes(double ejes) {
        this.ejes = ejes;
    }
}
