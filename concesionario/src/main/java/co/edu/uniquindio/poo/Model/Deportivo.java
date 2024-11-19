package co.edu.uniquindio.poo.Model;

public class Deportivo extends Vehiculo {
    private double pasajeros;
    private double numeroPuertas;
    private double airbags;
    private double caballosFuerza;
    private double ceroCien;
    
    public Deportivo(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
            double cambios, double velocidadMax, double cilindraje, double pasajeros, double numeroPuertas,
            double airbags, double caballosFuerza, double ceroCien, String placa) {
        super(tipoCombustible, tipoCaja, estado, marca, modelo, cambios, velocidadMax, cilindraje, placa);
        this.pasajeros = pasajeros;
        this.numeroPuertas = numeroPuertas;
        this.airbags = airbags;
        this.caballosFuerza = caballosFuerza;
        this.ceroCien = ceroCien;
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

    public double getAirbags() {
        return airbags;
    }

    public void setAirbags(double airbags) {
        this.airbags = airbags;
    }

    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getCeroCien() {
        return ceroCien;
    }

    public void setCeroCien(double ceroCien) {
        this.ceroCien = ceroCien;
    }

    
}
