package Model;

public record Color(String nombre, String hex) {

    public String nombre() {
        return nombre;
    }

    public String hex() {
        return hex;
    }

    @Override
    public String toString() {
        return "Color [" + nombre + "," + hex + "]";
    }
}
