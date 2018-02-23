package calculadora;

/**
 * Calculadora Notacion Polaca Inversa.
 * @author Alexandru Eusebiu Chiriac
 * @version 23/2/2018 v 0.05
 */
public class NodoPila {
	public NodoPila(double dato, NodoPila dato2) {
		this.dato = dato;
		this.dato2 = dato2;
	}
	public NodoPila dato2;
	public double dato;
}