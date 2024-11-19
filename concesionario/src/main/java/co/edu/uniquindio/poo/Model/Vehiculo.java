package co.edu.uniquindio.poo.Model;

public class Vehiculo {
    private TipoCombustible tipoCombustible;
    private TipoCaja tipoCaja;
    private Estado estado;
    private String placa;
    private String marca;
    private double modelo;
    private double cambios;
    private double velocidadMax;
    private double cilindraje;
    
    public Vehiculo(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
            double cambios, double velocidadMax, double cilindraje, String placa) {
        this.tipoCombustible = tipoCombustible;
        this.tipoCaja = tipoCaja;
        this.estado = estado;
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMax = velocidadMax;
        this.cilindraje = cilindraje;
        this.placa = placa;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(TipoCaja tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public double getCambios() {
        return cambios;
    }

    public void setCambios(double cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

    
}
