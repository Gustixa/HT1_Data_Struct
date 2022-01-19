/**
 * Clase que simula el funcionamiento de una radio.
 * 
 * @author Samuel Argueta, Rafael Pappa
 * @since 1.0, 16/01/2022
 * @version 1.0
 */
public class Radio implements IRadio {
	private boolean status = false;
	private int mode; // 0 = AM, 1 = FM, default = AM
	private int AM = 530; // Defau;t emisora = 530
	private double FM = 87.9; // Default emisora = 87.9
	private int[] AMsaved = new int[12];
	/** Lista de 12 estaciones AM guardadas, comienza vacía */
	private double[] FMsaved = new double[12];

	/** Lista de 12 estaciones FM guardadas, comienza vacía */

	public Radio(int mode) {
		this.mode = mode;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: getStatus.
	 * @return
	 */
	@Override
	public boolean getStatus() {
		return true;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: switchButton
	 */
	@Override
	public void switchButton() {

	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: changeMode
	 */
	@Override
	public void changeMode() {

	}

	/**
	 * Implementacion de la interfaz IRadio.
	 * 
	 * @see IRadio: getActualMode
	 * @return
	 */
	@Override
	public int getActualMode() {
		return 0;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: saveInAM.
	 * 
	 */
	@Override
	public void saveInAM() {

	}

	/**
	 * Implementación de la interfaz IRadio
	 * 
	 * @see IRadio: getSavedFreqAM.
	 * @return
	 */
	@Override
	public int getSavedFreqAM(int slot) {
		return 0;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: saveInFM.
	 * 
	 */
	@Override
	public void saveInFM() {

	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: getSavedFreqFM.
	 * @return
	 */
	@Override
	public double getSavedFreqFM() {
		return 0;
	}

	/**
	 * Implementación de la interfaz IRadio
	 * 
	 * @see IRadio: getActualFreqAM.
	 * @return
	 */
	@Override
	public int getActualFreqAM() {
		return 0;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: getActualFreqFM.
	 * @return
	 */
	@Override
	public double getActualFreqFM() {
		return 0;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: moveForward.
	 */
	@Override
	public void moveForward() {

	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: moveBackward
	 */
	@Override
	public void moveBackward() {

	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: seek.
	 */
	@Override
	public void seek() {

	}
}
