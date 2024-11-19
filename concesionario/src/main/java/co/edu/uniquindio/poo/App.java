package co.edu.uniquindio.poo;

import java.util.Date;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.Model.Administrador;
import co.edu.uniquindio.poo.Model.Cliente;
import co.edu.uniquindio.poo.Model.Concesionario;
import co.edu.uniquindio.poo.Model.Empleado;
import co.edu.uniquindio.poo.Model.Estado;
import co.edu.uniquindio.poo.Model.Moto;
import co.edu.uniquindio.poo.Model.Sedan;
import co.edu.uniquindio.poo.Model.TipoCaja;
import co.edu.uniquindio.poo.Model.TipoCombustible;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("Mi carro UQ", null, null, null, null, null);
        Administrador administradorPrincipal = new Administrador("Santiago", "Olarte", "1013109944", "123456");
        concesionario.crearPersona(administradorPrincipal);
        Date fechaActual = new Date(); // Obtiene la fecha actual
        boolean flag = true;
        while (flag == true){
            String accionElegida = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Salir \n 1. Gestionar vehiculos \n 2. Gestionar empleados \n 3. Gestionar clientes \n 4. Gestionar transacciones");
            switch (accionElegida){
                case "0":
                    JOptionPane.showMessageDialog(null, "Finalizando programa", "Información", JOptionPane.INFORMATION_MESSAGE);
                    flag = false;
                    break;
                case "1":
                    boolean flagVehiculo = true;
                    while (flagVehiculo == true){
                        String accionVehiculo = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Agregar vehiculo \n 2. Eliminar vehiculo \n 3. Buscar vehiculo");
                        switch(accionVehiculo){
                            case "0":
                                JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                flagVehiculo = false;
                                break;
                            case "1":
                                boolean flagTipoVehiculo = true;
                                while (flagTipoVehiculo == true) {
                                    String accionTipoVehiculo = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Agregar moto \n 2. Agregar sedan \n 3. Agregar depoprtivo \n 4. Agregar camioneta \n 5. Agregar Pick Up \n 6. Agregar van \n 7. Agregar bus \n 8. Agregar camion");
                                    switch (accionTipoVehiculo){
                                        case "0":
                                            JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                            flagTipoVehiculo = false;
                                            break;
                                        case "1":
                                            String tipoCombustibleMoto = JOptionPane.showInputDialog(null, "Elija el tipo de combustible \n 1. Gasolina \n 2. Diesel \n 3. Electrico \n 4. Hibrido");
                                            TipoCombustible combustibleMoto = null;
                                            switch(tipoCombustibleMoto){
                                                case "1":
                                                    combustibleMoto = TipoCombustible.GASOLINA;
                                                    break;
                                                case "2":
                                                    combustibleMoto = TipoCombustible.DIESEL;
                                                    break;
                                                case "3":
                                                    combustibleMoto = TipoCombustible.ELECTRICO;
                                                    break;
                                                case "4":
                                                    combustibleMoto = TipoCombustible.HIBRIDO;
                                                    break;
                                            }
                                            String tipoCajaMoto = JOptionPane.showInputDialog(null, "Elija el tipo de caja \n 1. Manual \n 2. Automatica");
                                            TipoCaja cajaMoto = null;
                                            switch(tipoCajaMoto){
                                                case "1":
                                                    cajaMoto = TipoCaja.MANUAL;
                                                    break;
                                                case "2":
                                                    cajaMoto = TipoCaja.AUTOMATICA;
                                                    break;
                                            }
                                            String estadoMotoPregunta = JOptionPane.showInputDialog(null, "Elija el estado \n 1. Nueva \n 2. Usada");
                                            Estado estadoMoto = null;
                                            switch(estadoMotoPregunta){
                                                case "1":
                                                    estadoMoto = Estado.NUEVO;
                                                    break;
                                                case "2":
                                                    estadoMoto = Estado.USADO;
                                                    break;
                                            }
                                            String marcaMoto = JOptionPane.showInputDialog(null, "Ingrese la marca:");
                                            double modeloMoto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el modelo:"));
                                            double cambiosMoto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los cambios:"));
                                            double velocidadMoto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad maxima:"));
                                            double cilindrajeMoto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cilindraje:"));
                                            String placaMoto = JOptionPane.showInputDialog(null, "Ingrese la placa:");
                                            Moto moto = new Moto(combustibleMoto, cajaMoto, estadoMoto, marcaMoto, modeloMoto, cambiosMoto, velocidadMoto, cilindrajeMoto, placaMoto);
                                            JOptionPane.showMessageDialog(null, concesionario.crearVehiculo(moto), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case "2":
                                            String tipoCombustibleSedan = JOptionPane.showInputDialog(null, "Elija el tipo de combustible \n 1. Gasolina \n 2. Diesel \n 3. Electrico \n 4. Hibrido");
                                            TipoCombustible combustibleSedan = null;
                                            switch(tipoCombustibleSedan){
                                                case "1":
                                                    combustibleSedan = TipoCombustible.GASOLINA;
                                                    break;
                                                case "2":
                                                    combustibleSedan = TipoCombustible.DIESEL;
                                                    break;
                                                case "3":
                                                    combustibleSedan = TipoCombustible.ELECTRICO;
                                                    break;
                                                case "4":
                                                    combustibleSedan = TipoCombustible.HIBRIDO;
                                                    break;
                                            }
                                            String tipoCajaSedan = JOptionPane.showInputDialog(null, "Elija el tipo de caja \n 1. Manual \n 2. Automatica");
                                            TipoCaja cajaSedan = null;
                                            switch(tipoCajaSedan){
                                                case "1":
                                                    cajaSedan = TipoCaja.MANUAL;
                                                    break;
                                                case "2":
                                                    cajaSedan = TipoCaja.AUTOMATICA;
                                                    break;
                                            }
                                            String estadoSedanPregunta = JOptionPane.showInputDialog(null, "Elija el estado \n 1. Nueva \n 2. Usada");
                                            Estado estadoSedan = null;
                                            switch(estadoSedanPregunta){
                                                case "1":
                                                    estadoSedan = Estado.NUEVO;
                                                    break;
                                                case "2":
                                                    estadoSedan = Estado.USADO;
                                                    break;
                                            }
                                            String marcaSedan = JOptionPane.showInputDialog(null, "Ingrese la marca:");
                                            double modeloSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el modelo:"));
                                            double cambiosSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los cambios:"));
                                            double velocidadSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad maxima:"));
                                            double cilindrajeSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cilindraje:"));
                                            String placaSedan = JOptionPane.showInputDialog(null, "Ingrese la placa:");
                                            double pasajerosSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros:"));
                                            double puertasSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de puertas:"));
                                            double capacidadSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad del maletero:"));
                                            String acPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene aire acondicionado? \n 1. Si \n 2. No");
                                            Boolean acSedan = false;
                                            switch(acPreguntaSedan){
                                                case "1":
                                                    acSedan = true;
                                                    break;
                                                case "2":
                                                    acSedan = false;
                                                    break;
                                            }
                                            String camaraReversaPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene camara de reversa? \n 1. Si \n 2. No");
                                            Boolean camaraReversaSedan = false;
                                            switch(camaraReversaPreguntaSedan){
                                                case "1":
                                                    camaraReversaSedan = true;
                                                    break;
                                                case "2":
                                                    camaraReversaSedan = false;
                                                    break;
                                            }
                                            String cruceroPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene control crucero? \n 1. Si \n 2. No");
                                            Boolean cruceroSedan = false;
                                            switch(cruceroPreguntaSedan){
                                                case "1":
                                                    cruceroSedan = true;
                                                    break;
                                                case "2":
                                                    cruceroSedan = false;
                                                    break;
                                            }
                                            double airbagsSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de airbags:"));
                                            String absPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene frenos ABS? \n 1. Si \n 2. No");
                                            Boolean absSedan = false;
                                            switch(absPreguntaSedan){
                                                case "1":
                                                    absSedan = true;
                                                    break;
                                                case "2":
                                                    absSedan = false;
                                                    break;
                                            }
                                            String sensoresColisionPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene sensores de colision? \n 1. Si \n 2. No");
                                            Boolean sensoresColisionSedan = false;
                                            switch(sensoresColisionPreguntaSedan){
                                                case "1":
                                                    sensoresColisionSedan = true;
                                                    break;
                                                case "2":
                                                    sensoresColisionSedan = false;
                                                    break;
                                            }
                                            String sensoresTraficoPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene sensores de trafico cruzado? \n 1. Si \n 2. No");
                                            Boolean sensoresTraficoSedan = false;
                                            switch(sensoresTraficoPreguntaSedan){
                                                case "1":
                                                    sensoresTraficoSedan = true;
                                                    break;
                                                case "2":
                                                    sensoresTraficoSedan = false;
                                                    break;
                                            }
                                            String permanenciaCarrilPreguntaSedan = JOptionPane.showInputDialog(null, "Tiene asistente de permanencia en el carril? \n 1. Si \n 2. No");
                                            Boolean permanenciaCarrilSedan = false;
                                            switch(permanenciaCarrilPreguntaSedan){
                                                case "1":
                                                    permanenciaCarrilSedan = true;
                                                    break;
                                                case "2":
                                                    permanenciaCarrilSedan = false;
                                                    break;
                                            }
                                            Sedan sedan = new Sedan(combustibleSedan, cajaSedan, estadoSedan, marcaSedan, modeloSedan, cambiosSedan, velocidadSedan, cilindrajeSedan, pasajerosSedan, puertasSedan, capacidadSedan, acSedan, camaraReversaSedan, cruceroSedan, airbagsSedan, absSedan, sensoresColisionSedan, sensoresTraficoSedan, permanenciaCarrilSedan, placaSedan);
                                            JOptionPane.showMessageDialog(null, concesionario.crearVehiculo(sedan), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                    }
                                }

                            case "2":
                                String placaEliminar = JOptionPane.showInputDialog(null, "Ingrese la placa:");
                                JOptionPane.showMessageDialog(null, concesionario.eliminarVehiculo(placaEliminar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case "3":
                                String placaBuscar = JOptionPane.showInputDialog(null, "Ingrese la placa:");
                                JOptionPane.showMessageDialog(null, concesionario.buscarVehiculo(placaBuscar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                    }
                case "2":
                    Boolean flagEmpleados = true;
                    while (flagEmpleados == true) {
                        String accionEmpleados = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Gestionar empleados");
                        switch (accionEmpleados) {
                            case "0":
                                JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                flagEmpleados = false;
                                break;
                            case "1":
                                String cedulaAdministrador = JOptionPane.showInputDialog(null, "Ingrese la cedula de administrador:");
                                String claveAdministrador = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador:");
                                if (claveAdministrador != null && cedulaAdministrador != null) {
                                    Boolean acceso = concesionario.verificarClave(cedulaAdministrador);
                                    if (acceso == true) {
                                        Boolean flagEmpleadosAdmin = true;
                                        while (flagEmpleadosAdmin == true) {
                                            String accionEmpleadosAdmin = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Agregar empleado \n 2. Buscar empleado \n 3. Eliminar empleado \n 4. Agregar administrador");
                                            switch(accionEmpleadosAdmin){
                                                case "0":
                                                    JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                                    flagEmpleadosAdmin = false;
                                                    break;
                                                case "1":
                                                    String nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
                                                    String apellidoEmpleado = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:");
                                                    String cedulaEmpleado = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado:");
                                                    Empleado empleado = new Empleado(nombreEmpleado, apellidoEmpleado, cedulaEmpleado, null);
                                                    JOptionPane.showMessageDialog(null, concesionario.crearPersona(empleado), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                                case "2":
                                                    String cedulaEmpleadoBuscar = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado:");
                                                    JOptionPane.showMessageDialog(null, concesionario.buscarPersona(cedulaEmpleadoBuscar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                                case "3":
                                                    String cedulaEmpleadoEliminar = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado a eliminar:");
                                                    JOptionPane.showMessageDialog(null, concesionario.eliminarPersona(cedulaEmpleadoEliminar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                                case "4":
                                                    String nombreAdministrador = JOptionPane.showInputDialog(null, "Ingrese el nombre del administrador:");
                                                    String apellidoAdministrador = JOptionPane.showInputDialog(null, "Ingrese el apellido del administrador:");
                                                    String cedulaAdministradorCrear = JOptionPane.showInputDialog(null, "Ingrese la cedula del administrador:");
                                                    String claveCrear = JOptionPane.showInputDialog(null, "Ingrese la clave del administrador:");
                                                    Administrador administrador = new Administrador(nombreAdministrador, apellidoAdministrador, cedulaAdministradorCrear, claveCrear);
                                                    JOptionPane.showMessageDialog(null, concesionario.crearPersona(administrador), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                        }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cedula o clave incorrecta", "Información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Información", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                        }
                    }
                case "3":
                    Boolean flagClientes = true;
                    while (flagClientes == true) {
                        String accionClientes = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Crear cliente \n 2. Buscar cliente \n 3. Eliminar cliente");
                        switch (accionClientes) {
                            case "0":
                                JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                flagClientes = false;
                                break;
                            case "1":
                                String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
                                String apellidoCliente = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:");
                                String cedulaCliente = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado:");
                                Cliente cliente = new Cliente(nombreCliente, apellidoCliente, cedulaCliente, null);
                                JOptionPane.showMessageDialog(null, concesionario.crearPersona(cliente), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "2":
                                String cedulaClienteBuscar = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                JOptionPane.showMessageDialog(null, concesionario.buscarPersona(cedulaClienteBuscar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "3":
                                String cedulaClienteEliminar = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente a eliminar:");
                                JOptionPane.showMessageDialog(null, concesionario.eliminarPersona(cedulaClienteEliminar), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                case "4":
                    Boolean flagTransacciones = true;
                    while (flagTransacciones == true) {
                        String accionTransacciones = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Alquilar vehiculo \n 2. Vender vehiculo \n 3. Comprar vehiculo \n 4. Informacion de transacciones");
                        switch (accionTransacciones){
                            case "0":
                                JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                flagTransacciones = false;
                                break;
                            case "1":
                                String finAlquiler = JOptionPane.showInputDialog(null, "Ingrese la fecha de fin:");
                                String cedulaClienteAlquiler = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                String placaVehiculoAlquiler = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo:");
                                JOptionPane.showMessageDialog(null, concesionario.crearAlquiler(fechaActual, finAlquiler, cedulaClienteAlquiler, placaVehiculoAlquiler), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "2":
                                String cedulaClienteVenta = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                String placaVehiculoVenta = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo:");
                                JOptionPane.showMessageDialog(null, concesionario.crearVenta(fechaActual, cedulaClienteVenta, placaVehiculoVenta), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "3":
                                String cedulaClienteCompra = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                String placaVehiculoCompra = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo:");
                                JOptionPane.showMessageDialog(null, concesionario.crearVenta(fechaActual, cedulaClienteCompra, placaVehiculoCompra), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case "4":
                                String cedulaAdministrador = JOptionPane.showInputDialog(null, "Ingrese la cedula de administrador:");
                                String claveAdministrador = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador:");
                                if (claveAdministrador != null && cedulaAdministrador != null) {
                                    Boolean acceso = concesionario.verificarClave(cedulaAdministrador);
                                    if (acceso == true) {
                                        Boolean flagInfoTransacciones = true;
                                        while (flagInfoTransacciones == true) {
                                            String accionInfoTransacciones = JOptionPane.showInputDialog(null, "Que accion desea realizar \n 0. Volver \n 1. Informacion alquileres \n 2. Informacion ventas \n 3. Informacion compras");
                                            switch (accionInfoTransacciones){
                                                case "0":
                                                    JOptionPane.showMessageDialog(null, "Volviendo al menu anterior", "Información", JOptionPane.INFORMATION_MESSAGE);
                                                    flagInfoTransacciones = false;
                                                    break;
                                                case "1":
                                                    String cedulaClienteInfoAlquiler = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                                    JOptionPane.showMessageDialog(null, concesionario.buscarAlquiler(cedulaClienteInfoAlquiler), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                                case "2":
                                                    String cedulaClienteInfoVentas = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:");
                                                    JOptionPane.showMessageDialog(null, concesionario.buscarAlquiler(cedulaClienteInfoVentas), "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                                    break;
                                            }
                                        }
                                    }
                        }
                }
        }
    }
}
}
}
