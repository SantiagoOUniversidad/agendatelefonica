package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import Model.Biblioteca;
import Model.Bibliotecario;
import Model.Estudiante;
import Model.Libro;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        boolean flag = true;
        while (flag == true) {
            String accionElegida = JOptionPane.showInputDialog(null, "Que accion desea realizar? \n 0. Salir \n 1. Nuevo estudiante \n 2. Nuevo bibliotecario \n 3. Nuevo libro \n 4. Nuevo prestamo \n 5. Buscar libro \n 6. Mostrar estudiante con mas prestamos \n 7. Entregar prestamo \n 8. Ver total de dinero recaudado \n 9. Reemplazar libro", "Inicio", JOptionPane.QUESTION_MESSAGE);
            switch (accionElegida) {

                //Salir de la app
                case "0":
                    JOptionPane.showMessageDialog(null, "Finalizando programa", "Información", JOptionPane.INFORMATION_MESSAGE);
                    flag = false;
                    break;
                
                //Crear estudiante
                case "1":
                    String nombreEstudiante = JOptionPane.showInputDialog(null, "Ingresa el nombre del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String cedulaEstudiante = JOptionPane.showInputDialog(null, "Ingresa la cedula del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String telefonoEstudiante = JOptionPane.showInputDialog(null, "Ingresa el telefono del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String correoEstudiante = JOptionPane.showInputDialog(null, "Ingresa el correo del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    Estudiante estudiante = new Estudiante(nombreEstudiante, cedulaEstudiante, telefonoEstudiante, correoEstudiante);
                    JOptionPane.showMessageDialog(null, biblioteca.crearEstudiante(estudiante), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                //Crear bibliotecario
                case "2":
                    String nombreBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el nombre del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    String cedulaBibliotecario = JOptionPane.showInputDialog(null, "Ingresa la cedula del bibliotecario", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String telefonoBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el telefono del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    String correoBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el correo del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    float salarioBibliotecario = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el salario del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE));
                    Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, cedulaBibliotecario, telefonoBibliotecario, correoBibliotecario, salarioBibliotecario);
                    JOptionPane.showMessageDialog(null, biblioteca.crearBibliotecario(bibliotecario), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Crear libro
                case "3":
                    String codigo = JOptionPane.showInputDialog(null, "Ingresa el codigo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String isbn = JOptionPane.showInputDialog(null, "Ingresa el ISBN del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String autor = JOptionPane.showInputDialog(null, "Ingresa el autor del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String titulo = JOptionPane.showInputDialog(null, "Ingresa el titulo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String editorial = JOptionPane.showInputDialog(null, "Ingresa la editorial del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    int unidadesDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las unidades disponibles del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE));
                    Libro libro = new Libro(codigo, isbn, autor, titulo, editorial, null, unidadesDisponibles);
                    JOptionPane.showMessageDialog(null, biblioteca.crearLibro(libro), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Crear prestamo
                case "4":
                    String cedulaEstudiantePrestamo = JOptionPane.showInputDialog(null, "Ingresa la cedula del estudiante", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    String cedulaBibliotecarioPrestamo = JOptionPane.showInputDialog(null, "Ingresa la cedula del bibliotecario", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    String codigoPrestamo = JOptionPane.showInputDialog(null, "Ingresa el codigo del prestamo", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    String codigoLibroPrestamo = JOptionPane.showInputDialog(null, "Ingresa el codigo del libro a prestar", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    Date fechaInicioPrestamo = new Date();
                    ArrayList<String> codigosLibros = new ArrayList<>();
                    Libro buscarLibro = biblioteca.buscarLibro(codigoLibroPrestamo);
                    String codigoLibroVerificado = buscarLibro.getCodigo(); 
                    codigosLibros.add(codigoLibroVerificado);
                    JOptionPane.showMessageDialog(null, biblioteca.crearPrestamo(codigoPrestamo, cedulaEstudiantePrestamo, cedulaBibliotecarioPrestamo, fechaInicioPrestamo, codigosLibros), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Buscar libro
                case "5":
                    String isbnBuscar = JOptionPane.showInputDialog(null, "Ingresa el codigo del libro", "Buscar libro", JOptionPane.QUESTION_MESSAGE);
                    if (biblioteca.buscarLibro(isbnBuscar) == null) {
                        JOptionPane.showMessageDialog(null, "El libro no existe", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, biblioteca.buscarLibro(isbnBuscar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                
                //Mostrar estudiante con mas prestamos
                case "6":
                    JOptionPane.showMessageDialog(null, "El estudiante con mas prestamos es " + biblioteca.estudianteConMasPrestamos(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Entregar prestamo
                case "7":
                    String codigoPrestamoEntrega = JOptionPane.showInputDialog(null, "Ingresa el codigo del prestamo", "Nueva entrega", JOptionPane.QUESTION_MESSAGE);
                    Date fechaEntrega = new Date();
                    JOptionPane.showMessageDialog(null, biblioteca.entregarPrestamo(codigoPrestamoEntrega, fechaEntrega), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Total recaudado por la biblioteca
                case "8":
                    JOptionPane.showMessageDialog(null, "El total recaudado por la biblioteca es " + biblioteca.totalDineroRecaudado(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //Reemplazar libro
                case "9":
                    String codigoEditado = JOptionPane.showInputDialog(null, "Ingresa el codigo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String isbnEditado = JOptionPane.showInputDialog(null, "Ingresa el ISBN del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String autorEditado = JOptionPane.showInputDialog(null, "Ingresa el autor del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String tituloEditado = JOptionPane.showInputDialog(null, "Ingresa el titulo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String editorialEditado = JOptionPane.showInputDialog(null, "Ingresa la editorial del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    int unidadesDisponiblesEditado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las unidades disponibles del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE));
                    Libro libroEditado = new Libro(codigoEditado, isbnEditado, autorEditado, tituloEditado, editorialEditado, null, unidadesDisponiblesEditado);
                    JOptionPane.showMessageDialog(null, biblioteca.reemplazarLibro(codigoEditado, libroEditado), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    break;
            }
        }
    }
}
