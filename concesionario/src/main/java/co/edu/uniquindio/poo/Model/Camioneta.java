package co.edu.uniquindio.poo.Model;

public class Camioneta extends Vehiculo {
    private double pasajeros;
    private double numeroPuertas;
    private double capacidadMaletero;
    private Boolean AC;
    private Boolean camaraReversa;
    private Boolean crucero;
    private double airbags;
    private Boolean abs;
    private Boolean sensoresColision;
    private Boolean traficoCruzado;
    private Boolean permanenciaCarril;
    private Boolean traccionCuatro;
    
    public Camioneta(TipoCombustible tipoCombustible, TipoCaja tipoCaja, Estado estado, String marca, double modelo,
            double cambios, double velocidadMax, double cilindraje, double pasajeros, double numeroPuertas,
            double capacidadMaletero, Boolean aC, Boolean camaraReversa, Boolean crucero, double airbags, Boolean abs,
            Boolean sensoresColision, Boolean traficoCruzado, Boolean permanenciaCarril, Boolean traccionCuatro, String placa) {
        super(tipoCombustible, tipoCaja, estado, marca, modelo, cambios, velocidadMax, cilindraje, placa);
        this.pasajeros = pasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        AC = aC;
        this.camaraReversa = camaraReversa;
        this.crucero = crucero;
        this.airbags = airbags;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.traficoCruzado = traficoCruzado;
        this.permanenciaCarril = permanenciaCarril;
        this.traccionCuatro = traccionCuatro;
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

    public Boolean getCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(Boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public Boolean getCrucero() {
        return crucero;
    }

    public void setCrucero(Boolean crucero) {
        this.crucero = crucero;
    }

    public double getAirbags() {
        return airbags;
    }

    public void setAirbags(double airbags) {
        this.airbags = airbags;
    }

    public Boolean getAbs() {
        return abs;
    }

    public void setAbs(Boolean abs) {
        this.abs = abs;
    }

    public Boolean getSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(Boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public Boolean getTraficoCruzado() {
        return traficoCruzado;
    }

    public void setTraficoCruzado(Boolean traficoCruzado) {
        this.traficoCruzado = traficoCruzado;
    }

    public Boolean getPermanenciaCarril() {
        return permanenciaCarril;
    }

    public void setPermanenciaCarril(Boolean permanenciaCarril) {
        this.permanenciaCarril = permanenciaCarril;
    }

    public Boolean getTraccionCuatro() {
        return traccionCuatro;
    }

    public void setTraccionCuatro(Boolean traccionCuatro) {
        this.traccionCuatro = traccionCuatro;
    }

    
}
