import java.io.IOException;

/**
 * Clase que simula el funcionamiento del controlador, en un modelo M-V-C.
 * 
 * @author Samuel Argueta, Rafael Pappa.
 * @since 1.0, 16/01/2022
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
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// es meramente estético.
        view.welcome();
        int options = view.input_verification("start_options");// see input_verification for more info.
        switch (options) {
            case 1:
                radio_on(view);
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
    private static void radio_on(Interaction view) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// es meramente estético.
        int options = view.input_verification("radio_options");

        switch (options) {
            case 1:
                // AM
                new Radio(1);
                break;
            default:
                // FM
                new Radio(0);
                break;
        }
    }
}
