import java.io.IOException;

/**
 * Clase que simula el funcionamiento del controlador, en un modelo M-V-C.
 * 
 * @author Samuel Argueta, Rafael Pappa, Sebastian Estrada.
 * @since 1.0, 19/01/2022
 * @version 1.0
 */
public class Main {

    /**
     * Método que le da vida la programa para que funcione.
     * 
     * @param args, String[]
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Interaction view = new Interaction();
        Radio radio = new Radio(0);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// es meramente estético.
        view.welcome();
        int options = view.input_verification("start_options");// see input_verification for more info.
        switch (options) {
            case 1:
                radio_on(view, radio);
                break;

            default:
                view.end_sys();
                break;
        }
    }

    /**
     * Este metodo sirve para poder proseguir con la serie de acciones que son
     * coherentes para el sistema. Es mejor tenerlo en métodos separados para no
     * tener un solo desorde (aunque de por si, ya lo parece)
     * 
     * @param view
     * @throws IOException
     * @throws InterruptedException
     */
    private static void radio_on(Interaction view, Radio radio) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// es meramente estético.
        boolean next_step = false;
        System.out.println(radio.getActualMode());
        do {
            int options = view.input_verification("radio_options");
            // Verificar que no seleccione un emisora ya puesta.
            if (radio.getActualMode() == 0 && options == 1) {
                next_step = false;
            } else if (radio.getActualMode() == 1 && options == 2) {
                next_step = false;
            } else {
                next_step = true;
            }

            switch (options) {
                case 1:
                    // AM

                    menu_radio(view, radio.getActualMode());
                    break;
                default:
                    // FM

                    menu_radio(view, radio.getActualMode());
                    break;
            }
        } while (!next_step);

    }

    private static void menu_radio(Interaction view, int mode) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int options = view.input_verification("menu_radioAM");
        if (mode == 1) {
            options = view.input_verification("menu_radioFM");
        }

        switch (options) {
            case 1:
                // menu 1
                break;
            case 2:
                // menu 2
                break;
            case 3:
                // menu 3
                break;
            case 4:
                // menu 4
                break;
            case 5:
                // menu 5
                break;
            default:
                break;
        }
    }
}
