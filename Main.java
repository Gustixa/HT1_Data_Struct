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
        view.welcome();
        start_mode(view, 0);

    }

    private static void start_mode(Interaction view, int value) throws IOException, InterruptedException {
        Radio radio = new Radio(value);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// es meramente estético.
        int options = view.input_verification("start_options", "NONE");// see input_verification for more info.
        switch (options) {
            case 1:
                menu_radio(view, radio);
                break;

            default:
                view.end_sys();
                break;
        }
    }

    /**
     * Método para poder realizar alguna de las funciones de la radio.
     * 
     * @param view:  Interaction
     * @param radio: Radio
     * @throws IOException
     * @throws InterruptedException
     */
    private static void menu_radio(Interaction view, Radio radio) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        boolean back = false;
        int options = 0;

        do {
            if (radio.getActualMode() == 1) {
                options = view.input_verification("menu_radio", "FM");
            } else if (radio.getActualMode() == 0) {
                options = view.input_verification("menu_radio", "AM");
            }
            switch (options) {
                case 1:
                    // Cambio de exmisora (AM - FM o FM - AM)
                    radio.changeMode();
                    break;
                case 2:
                    // Mover
                    break;
                case 3:
                    // Guardar emisora
                    break;
                case 4:
                    // Mostrar emisoras guardadas
                    break;
                default:
                    // Apagar el radio.
                    start_mode(view, radio.getActualMode());
                    break;
            }
        } while (options != 5);
    }

    /**
     * Metodo para no realizar un cambio tan repentino de la pantalla. Es decir,
     * mantener la pantalla segun el tiempo (en milisegundos) que se le pase como
     * parametro.
     * 
     * @param tiempo_espera: int
     */
    private static void esperar(int tiempo_espera) {
        try {
            Thread.sleep(tiempo_espera);
        } catch (Exception e) {
            System.out.println("Algo salio malo...");
        }
    }
}
