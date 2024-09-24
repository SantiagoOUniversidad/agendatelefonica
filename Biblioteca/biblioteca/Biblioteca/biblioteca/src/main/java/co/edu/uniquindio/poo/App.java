package co.edu.uniquindio.poo;

import Model.biblioteca;
import Model.libro;
import Model.prestamo;
import Model.estudiante;
import Model.bibliotecario;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca(null, null, null, null, null, null);
        boolean flag = true;
        while (flag == true) {
            String accionElegida = JOptionPane.showInputDialog(null, "Que accion desea realizar? \n 0. Salir \n 1. Nuevo estudiante \n 2. Nuevo bibliotecario \n 3. Nuevo libro \n 4. Nuevo prestamo \n 5. Buscar libro\n Profe, el programa no esta completo ya que hay funciones que no se realizar bien, espero poder aclarar mis dudas en clase y terminar el programa. Gracias", "Inicio", JOptionPane.QUESTION_MESSAGE);
            switch (accionElegida) {
                case "0":
                    JOptionPane.showMessageDialog(null, "Finalizando programa", "Información", JOptionPane.INFORMATION_MESSAGE);
                    flag = false;
                    break;
                
                case "1":
                    String nombreEstudiante = JOptionPane.showInputDialog(null, "Ingresa el nombre del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String cedulaEstudiante = JOptionPane.showInputDialog(null, "Ingresa la cedula del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String telefonoEstudiante = JOptionPane.showInputDialog(null, "Ingresa el telefono del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String correoEstudiante = JOptionPane.showInputDialog(null, "Ingresa el correo del estudiante", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    estudiante estudiante = new estudiante(nombreEstudiante, cedulaEstudiante, telefonoEstudiante, correoEstudiante);
                    JOptionPane.showMessageDialog(null, biblioteca.crearEstudiante(estudiante), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(biblioteca.listaEstudiantes);
                    break;
                
                case "2":
                    String nombreBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el nombre del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    String cedulaBibliotecario = JOptionPane.showInputDialog(null, "Ingresa la cedula del bibliotecario", "Nuevo estudiante", JOptionPane.QUESTION_MESSAGE);
                    String telefonoBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el telefono del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    String correoBibliotecario = JOptionPane.showInputDialog(null, "Ingresa el correo del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE);
                    float salarioBibliotecario = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el salario del bibliotecario", "Nuevo bibliotecario", JOptionPane.QUESTION_MESSAGE));
                    bibliotecario bibliotecario = new bibliotecario(nombreBibliotecario, cedulaBibliotecario, telefonoBibliotecario, correoBibliotecario, salarioBibliotecario, null);
                    JOptionPane.showMessageDialog(null, biblioteca.crearBibliotecario(bibliotecario), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(biblioteca.listaBibliotecarios);
                    break;

                case "3":
                    String codigo = JOptionPane.showInputDialog(null, "Ingresa el codigo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String isbn = JOptionPane.showInputDialog(null, "Ingresa el ISBN del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String autor = JOptionPane.showInputDialog(null, "Ingresa el autor del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String titulo = JOptionPane.showInputDialog(null, "Ingresa el titulo del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    String editorial = JOptionPane.showInputDialog(null, "Ingresa la editorial del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE);
                    int unidadesDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las unidades disponibles del libro", "Nuevo libro", JOptionPane.QUESTION_MESSAGE));
                    libro libro = new libro(codigo, isbn, autor, titulo, editorial, null, unidadesDisponibles);
                    JOptionPane.showMessageDialog(null, biblioteca.crearLibro(libro), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(biblioteca.listaLibros);
                    break;

                case "4":
                    String fechaPrestamo = JOptionPane.showInputDialog(null, "Ingresa la fecha del inicio del prestamo", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    String fechaEntrega = JOptionPane.showInputDialog(null, "Ingresa la fecha de entrega del prestamo", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    String codigoPrestamo = JOptionPane.showInputDialog(null, "Ingresa el codigo del prestamo", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE);
                    float total = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el total del prestamo", "Nuevo prestamo", JOptionPane.QUESTION_MESSAGE));
                    prestamo prestamo = new Model.prestamo(fechaPrestamo, fechaEntrega, codigoPrestamo, total, null);
                    JOptionPane.showMessageDialog(null, biblioteca.crearPrestamo(prestamo), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(biblioteca.listaPrestamos);
                    break;

                case "5":
                    String isbnBuscar = JOptionPane.showInputDialog(null, "Ingresa el isbn del libro", "Buscar libro", JOptionPane.QUESTION_MESSAGE);
                    if (biblioteca.buscarLibro(isbnBuscar) == null) {
                        JOptionPane.showMessageDialog(null, "El libro no existe", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, biblioteca.buscarLibro(isbnBuscar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                default:
                    break;
            }
        }
    }
}
