package Model;
import java.util.Date;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Estudiante> estudiantes;
    public ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;
    private double totalDineroRecaudado;

    public Biblioteca() {
        bibliotecarios = new ArrayList<>();
        estudiantes = new ArrayList<>();
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
        totalDineroRecaudado = 0.0;
    }

    // Método para añadir bibliotecario
    public String crearBibliotecario(Bibliotecario bibliotecario) {
        String mensaje = "Error al crear bibliotecario";
        if (bibliotecario != null) {
            bibliotecarios.add(bibliotecario);
            mensaje = "Bibliotecario creado";
            return mensaje;
        }else{
            return mensaje;
        }
    }

    // Método para añadir estudiante
    public String crearEstudiante(Estudiante estudiante) {
        String mensaje = "Error al crear estudiante";
        if (estudiante != null) {
            estudiantes.add(estudiante);
            mensaje = "Estudiante creado";
            return mensaje;
        }else{
            return mensaje;
        }
    }

    // Método para añadir libro
    public String crearLibro(Libro libro) {
        String mensaje = "Error al crear libro";
        if (libro != null) {
            libros.add(libro);
            mensaje = "Libro creado";
            return mensaje;
        }else{
            return mensaje;
        }
        
    }

    // Método para buscar libro por código
    public Libro buscarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    // Metodo para buscar estudiante por cedula
    public Estudiante buscarEstudiante(String cedula){
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    // Metodo para buscar estudiante por cedula
    public Bibliotecario buscarBibliotecario(String cedula){
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                return bibliotecario;
            }
        }
        return null;
    }
    
    //Metodo para crear un prestamo
    public String crearPrestamo(String codigo, String cedulaEstudiante, String cedulaBibliotecario, Date fechaPrestamo, ArrayList<String> codigosLibros) {

        Prestamo prestamo = new Prestamo(codigo, buscarEstudiante(cedulaEstudiante), buscarBibliotecario(cedulaBibliotecario), fechaPrestamo);
        
        String mensaje = "Libro no encontrado";
        
        for (String codigoLibro : codigosLibros) {
            Libro libro = buscarLibro(codigoLibro);
            if (libro != null & buscarEstudiante(cedulaEstudiante) != null & buscarBibliotecario(cedulaBibliotecario) != null) {
                if (libro.getUnidadesDisponibles() > 0) {
                    prestamo.agregarLibro(libro);
                    libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1);
                    mensaje = "Prestamo creado";
                    prestamos.add(prestamo);
                    System.out.println(prestamos);
                } else {
                    mensaje = "No hay unidades disponibles";
                }
            } else {
                return mensaje;
            }
        }
        return mensaje;
    }

    // Método para buscar cantidad de préstamos por nombre del libro
    public int buscarCantidadPrestamosPorNombre(String nombre) {
        int cuenta = 0;
        for (Prestamo prestamo : prestamos) {
            for (Libro libro : prestamo.getLibros()) {
                if (libro.getTitulo().equals(nombre)) {
                    cuenta++;
                }
            }
        }
        return cuenta;
    }

    // Método para reemplazar libro por otro
    public String reemplazarLibro(String codigo, Libro nuevoLibro) {
        String mensaje = "No se encontró un libro";
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigo)) {
                libros.set(i, nuevoLibro);
                mensaje = "Libro editado";
                break;
            }
        }
        return mensaje;
    }

    // Consultar datos de un préstamo con código
    public Prestamo buscarPrestamoPorCodigo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                return prestamo;
            }
        }
        return null;
    }

    // Mostrar la cantidad de préstamos realizados por cada bibliotecario
    public String mostrarCantidadPrestamosBibliotecario() {
        String mensaje = "";
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int cantidadPrestamos = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getBibliotecario().equals(bibliotecario)) {
                    cantidadPrestamos++;
                }
            }
            mensaje += "El bibliotecario: " + bibliotecario.getNombre() + " ha realizado " + cantidadPrestamos + " préstamos";
        }
        return mensaje;
    }

    // Mostrar estudiante con más préstamos
    public Estudiante estudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;

        for (Estudiante estudiante : estudiantes) {
            int prestamosEstudiante = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getEstudiante().equals(estudiante)) {
                    prestamosEstudiante++;
                }
            }
            if (prestamosEstudiante > maxPrestamos) {
                maxPrestamos = prestamosEstudiante;
                estudianteConMasPrestamos = estudiante;
            }
        }
        return estudianteConMasPrestamos;
    }

    // Total de dinero recaudado
    public double totalDineroRecaudado() {
        return totalDineroRecaudado;
    }

    // Método para entregar préstamo
    public String entregarPrestamo(String codigoPrestamo, Date fechaEntrega) {
        String mensaje = "No se ha entregado el libro";
        Prestamo prestamo = buscarPrestamoPorCodigo(codigoPrestamo);
        if (prestamo != null) {
            double costo = prestamo.entregarPrestamo(fechaEntrega);
            totalDineroRecaudado += costo;
            mensaje = "Se ha entregado el libro";
            return mensaje;
        }
        return mensaje;
    }
}
