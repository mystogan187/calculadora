package calculadora;

/**
 * Calculadora Notacion Polaca Inversa
 * @author Alexandru Eusebiu Chiriac
 * @version 23/2/2018 v 0.01
 */
class NodoPila {
	public NodoPila(double dato, NodoPila abajo) {
		this.dato = dato;
		this.abajo = abajo;
	}
	public NodoPila abajo;
	public double dato;
}