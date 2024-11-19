package co.edu.uniquindio.poo.Model;

public class Vans extends Vehiculo {
    private double pasajeros;
    private double numeroPuertas;
    private double capacidadMaletero;
    private Boolean AC;
    private double airbags;
    private Boolean camaraReversa;
    private Boolean abs;
    public Vans(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
            double cambios, double velocidadMax, double cilindraje, double pasajeros, double numeroPuertas,
            double capacidadMaletero, Boolean aC, double airbags, Boolean camaraReversa, Boolean abs, String placa) {
        super(tipoCombustible, tipoCaja, estado, marca, modelo, cambios, velocidadMax, cilindraje, placa);
        this.pasajeros = pasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        AC = aC;
        this.airbags = airbags;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
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
    public double getAirbags() {
        return airbags;
    }
    public void setAirbags(double airbags) {
        this.airbags = airbags;
    }
    public Boolean getCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(Boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
    public Boolean getAbs() {
        return abs;
    }
    public void setAbs(Boolean abs) {
        this.abs = abs;
    }

    
}
