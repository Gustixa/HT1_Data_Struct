import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

/**
 * Esta clase sirve para poder interactuar, de manera textual, con el usuario
 * del simulador.
 * 
 * @author Samuel Argueta, Rafael Dubois, Sebastian Estrada.
 * @since 1.0, 19/01/2022
 * @version 1.0
 */
public class Interaction {
    /**
     * Este metodo solamente despliega un mensaje de bienvenida al usuario.
     */
    public void welcome() {
        System.out.println("Bienvenido al simulador del Radio!");

    }

    /**
     * Método que muestra un mensaje indicando que se cierra el sistema.
     */
    public void end_sys() {
        System.out.println("\nApagando el equipo...");
    }

    /**
     * Método que provee las 2 opciones principales del sistema.
     */

    private void start_options() {
        System.out.println("Opciones de inicio:");
        System.out.println("1. Encender la radio.");
        System.out.println("2. Salir.\n");
    }

    /**
     * Método que muestra las emisoras que puede escoger el usuario.
     */
    private void radio_options() {
        System.out.println("Tipos de frecuencia:");
        System.out.println("1. AM.");
        System.out.println("2. FM.");
    }

    /**
     * Método que muestra las acciones que se pueden realizar en la radio.
     */
    private void menu_radio(String mensaje) {
        if (mensaje.equals("AM")) {
            System.out.println("Usted est� escuchando la radio en frecuencia AM.\n"
            		+ "Menu de radio:\n" + 
            		"1. Cambiar de AM a FM.");
        } else {
            System.out.println("Usted est� escuchando la radio en frecuencia FM.\n"
            		+ "Menu de radio:\n" + 
            		"1. Cambiar de FM a AM.");
        }

        System.out.println("2. Cambiar radio hacia arriba.\n" +
                "3. Guardar emisora.\n" +
                "4. Mostrar emisoras guardadas.\n" +
                "5. Apagar el radio.\n");

    }

    /**
     * Método que verifica que las entradas por parte de los usuarios sean las
     * correctas.
     * 
     * @param menu_selection, String. Se pasa el tipo de menu que se desea mostrar.
     * @param emisora:        String, indica el de opciones que se deben mostrar
     *                        segun la emisora
     * @return input_user, int. Devuelve la selección que tomo el usuario, la cual
     *         será para poder seguir en la secuencia de pasos, segun su selección.
     */
    public int input_verification(String menu_selection, String emisora) {
        int amount_options = 0, input_user = 0;
        boolean next_step = false;
        do {
            if (menu_selection.equals("start_options")) {
                start_options();
                amount_options = 2;
            } else if (menu_selection.equals("radio_options")) {
                radio_options();
                amount_options = 2;
            } else if (menu_selection.equals("menu_radio")) {
                menu_radio(emisora);
                amount_options = 5;
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
