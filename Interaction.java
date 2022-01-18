import javax.swing.JOptionPane;

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

    public void end_sys() {
        System.out.println("Se apago el simulador");
    }

    /**
     * 
     */

    private void start_options() {
        System.out.println("Opciones de inicio");
        System.out.println("1. Encender la radio");
        System.out.println("2. Salir.");
    }

    /**
     * 
     */
    private void radio_options() {
        System.out.println("Tipos de emisora");
        System.out.println("1. AM");
        System.out.println("2. FM");
    }

    /**
     * Método que verifica que las entradas por parte de los usuarios sean las
     * correctas.
     * 
     * @param menu_selection, String. Se pasa el tipo de menu que se desea mostrar.
     * @return input_user, int. Devuelve la selección que tomo el usuario, la cual
     *         será para poder seguir en la secuencia de pasos, segun su selección.
     */
    public int input_verification(String menu_selection) {
        int amount_options = 0, input_user = 0;
        boolean next_step = false;
        do {
            if (menu_selection.equals("start_options")) {
                start_options();
                amount_options = 2;
            } else if (menu_selection.equals("radio_options")) {
                radio_options();
                amount_options = 2;
            }
            try {
                input_user = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1 de las opciones"));
                if (input_user < 1 || input_user > amount_options) {
                    System.out.println("DEBE SELECCIONAR UNA DE LAS OPCIONES PROVEIDAS!");
                } else {
                    next_step = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("DEBE INGRESAR UN VALOR NUMERICO!");
            }
        } while (!next_step);
        return input_user;
    }

}
