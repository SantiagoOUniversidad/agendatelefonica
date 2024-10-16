package Model;

public class Ropa {
    private String marca;
    private String talla;
    private Color color;

    public Ropa(String marca, String talla, Color color) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ropa [marca=" + marca + ", talla=" + talla + "]" + color;
    }
}