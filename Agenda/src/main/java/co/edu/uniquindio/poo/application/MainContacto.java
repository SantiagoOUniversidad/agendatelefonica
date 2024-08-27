package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.unquincio.poo.model.Contacto;

public class MainContacto {
    public static void main(String[] args) {
        Contacto Contacto1 = new Contacto("Juan", "EL grañas", "Barrio Santander", "300213453", "Juan@gmail.com");
        Contacto Contacto2 = new Contacto("PEPE", "EL pepe", "Barrio granada", "222212122", "pepe@gmail.com");

        if (Contacto1.equals(Contacto2)){
            JOptionPane.showMessageDialog(null, "El contacto:\n" + Contacto1 + "\nEs igual a:\n" + Contacto2);
        } else {
            JOptionPane.showMessageDialog(null, "El contacto:\n" + Contacto1.toString() + "\nno es igual a:\n" + Contacto2.toString());
        }
    }
}
