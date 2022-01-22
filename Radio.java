/**
 * Clase que simula el funcionamiento de una radio.
 * 
 * @author Samuel Argueta, Rafael Dubois, Sebastian Estrada.
 * @since 1.0, 19/01/2022
 * @version 1.0
 */
public class Radio implements IRadio {
	private boolean status = false;
	private int mode; // 0 = AM, 1 = FM, default = AM
	private int AM = 530; // Defau;t emisora = 530
	private double FM = 87.9; // Default emisora = 87.9
	private Integer[] AMsaved = new Integer[12];
	/** Lista de 12 estaciones AM guardadas, comienza vacía */
	private Double[] FMsaved = new Double[12];

	/** Lista de 12 estaciones FM guardadas, comienza vacía */

	/**
	 * Costructor, inicializa la emisora.
	 * 
	 * @param mode, int. Tipo de emisora.
	 */
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
		return status;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: switchButton
	 */
	@Override
	public void switchButton() {
		if (mode == 0) {
			mode = 1;
		} else if (mode == 1) {
			mode = 0;
		}
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: changeMode
	 */
	@Override
	public void changeMode() {
		if (mode == 0) {
			mode = 1;
		} else if (mode == 1) {
			mode = 0;
		}
	}

	/**
	 * Implementacion de la interfaz IRadio.
	 * 
	 * @see IRadio: getActualMode
	 * @return
	 */
	@Override
	public int getActualMode() {
		return mode;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: saveInAM.
	 * 
	 */
	@Override
	public void saveInAM() {
		for (int i = 0; i < AMsaved.length; i++) {
			if (AMsaved[i] == null) {
				AMsaved[i] = AM;
			}
		}
	}

	/**
	 * Implementación de la interfaz IRadio
	 * 
	 * @see IRadio: getSavedFreqAM.
	 * @return
	 */
	@Override
	public int getSavedFreqAM(int slot) {
		return AMsaved[slot];
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: saveInFM.
	 * 
	 */
	@Override
	public void saveInFM() {
		for (int i = 0; i < FMsaved.length; i++) {
			if (FMsaved[i] == null) {
				FMsaved[i] = FM;
			}
		}
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
		return AM;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: getActualFreqFM.
	 * @return
	 */
	@Override
	public double getActualFreqFM() {
		return FM;
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: moveForward.
	 */
	@Override
	public void moveForward() {
		if (mode == 0) { // Si es AM
			if (AM < 1610) {// Si es menor al maximo suma 10 a la estacion actual
				AM += 10;
			} else if (AM == 1610) { // Si esta en la estacion maxima regresa a la estacion mas pequeña
				AM = 530;
			}
		} else if (mode == 1) {// Si es FM
			if (FM < 107.9) {// Si es menor a la estacion maxima, suma 10 a la estacion actual
				FM += 0.2;
			} else if (FM == 107.9) {// Si esta en la estacion maxima, regresa a la estacion mas pequeña
				FM = 87.9;
			}
		}
	}

	/**
	 * Implementación de la interfaz IRadio.
	 * 
	 * @see IRadio: moveBackward
	 */
	@Override
	public void moveBackward() {
		if (mode == 0) { // Si es AM
			if (AM > 530) {// Si es menor al maximo suma 10 a la estacion actual
				AM -= 10;
			} else if (AM == 530) { // Si esta en la estacion maxima regresa a la estacion mas pequeña
				AM = 1610;
			}
		} else if (mode == 1) {// Si es FM
			if (FM > 87.9) {// Si es menor a la estacion maxima, suma 10 a la estacion actual
				FM -= 0.2;
			} else if (FM == 87.9) {// Si esta en la estacion maxima, regresa a la estacion mas pequeña
				FM = 107.9;
			}
		}
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
