//import javax.swing.JOptionPane;

/**
 * Esta clase sirve para poder interactuar, de manera textual, con el usuario
 * del simulador.
 * 
 * @author Samuel Argueta, Rafael Pappa
 * @since 1.0, 16/01/2022
 * @version 1.0
 */
public class Interaction {
    /**
     * Este meteodo solamente despliega un mensaje de bienvenida al usuario.
     */
    public void welcome() {
        System.out.println("Bienvenido al simulador del Radio!");
    }

    /**
     * Este método indica que se ha ingresado un dato fuera de contexto o que no es
     * requerido según el campo.
     */
    public void wrong_data() {
        System.out.println("DEBE SELECCIONAR UNA DE LAS OPCIONES PRESENTADAS!");
    }

    /**
     * Este método indica que una de las selecciones está fuera del rango.
     */
    public void out_of_range() {
        System.out.println("DEBE SELECCIONAR UNA DE LAS OPCIONES PROVEIDAS!");
    }

    public void options() {

    }

}
