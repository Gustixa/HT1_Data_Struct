package com.uvg.ayed;

/*************************************************
 * Clase radio (Radio.java)
 * Enero del 2022
 * Controla el estado y acciones en la radio
 * Importa el paquete completo java.util
 * @author Rafael Dubois 19093
 * @author Josue Argueta 211024
**************************************************/

import java.util.*;

public class Radio implements IRadio{

	/** Declarar atributos*/
	
	private boolean status = false;
	private int mode = 0; /** 0 es AM y 1 es FM, con esto el default es AM */
	private int AM = 530; /** El default en el modo AM es 530 */
	private double FM = 87.9; /** El default en el modo FM es 87.9 */
	private int[] AMsaved = new int[12]; /** Lista de 12 estaciones AM guardadas, comienza vacía */
	private double[] FMsaved = new double[12]; /** Lista de 12 estaciones FM guardadas, comienza vacía */
	
	/** Implementar métodos*/
	
	
	
}
