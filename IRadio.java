/**
 * Interfaz que predefine las caracteristicas globales que posee una radio
 * sencilla.
 * 
 * @author Moises Antonio Alonso Gonzales
 * @since 1.0, 16/01/2022
 * @version 1.0
 */
public interface IRadio {
	/**
	 * Devuelve el estado general de la radio.
	 * 
	 * @return
	 */
	public boolean getStatus();

	/**
	 * Permite ciertas funciones de la radio.
	 */
	public void switchButton();

	/**
	 * Permite cambiar entre emisoras.
	 */
	public void changeMode();

	/**
	 * Retorna la emisora actual de la radio.
	 */
	public int getActualMode();

	/**
	 * Almacena la estación en el apartado de AM.
	 */
	public void saveInAM();

	/**
	 * Retorna las estaciones almacenadas de AM.
	 * 
	 * @param slot
	 * @return
	 */
	public int getSavedFreqAM(int slot);

	/**
	 * Almacena la estación en el apartado de FM.
	 */
	public void saveInFM();

	/**
	 * Devuelve las estaciones almacenadas de FM.
	 * 
	 * @return
	 */
	public double getSavedFreqFM();

	/**
	 * Devuelve la estación actual de AM.
	 * 
	 * @return
	 */
	public int getActualFreqAM();

	/**
	 * Devuelve la estación actual de FM.
	 */
	public double getActualFreqFM();

	/**
	 * Avanza a la siguiente estación.
	 */
	public void moveForward();

	/**
	 * Regresa a la estación previa.
	 */
	public void moveBackward();

	/**
	 * Buscan una estación en particular.
	 */
	public void seek();
}