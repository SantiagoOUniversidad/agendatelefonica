package co.edu.uniquindio.poo.Model;

public class Moto extends Vehiculo {
    public Moto(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
    double cambios, double velocidadMax, double cilindraje, String placa) {
        super(tipoCombustible, tipoCaja, estado, marca, modelo, cambios, velocidadMax, cilindraje, placa);
    }

    @Override
    public String toString() {
        return "Moto []";
    }

    
}
