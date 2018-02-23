package calculadora;
/**
 * Calculadora Notacion Polaca Inversa.
 * @author Alexandru Eusebiu Chiriac
 * @version 23/2/2018 v 0.01
 */
public class RPN {
	private String commando;
	private NodoPila dato1;
	
	public void pushPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, dato1);
		dato1 = nuevo_nodo;
	}
	/**
	 * El metodo devuelve un doble.
	 * @return dato_arriba es el dato1.
	 */
	public double popPila( ) {
		double dato_arriba = dato1.dato;
		dato1 = dato1.dato2;
		return dato_arriba;
	}
	/**
	 * @param commando pasado
	 */
	public RPN(String commando) {
		dato1 = null;
		this.commando = commando;
	}
	/**
	 * Metodo donde se realiza la operación y comprobación del comando.
	 * @return resultado de la operación.
	 */
	public double resultado( ) {
		double a, b;
		int j;
		for(int i = 0; i < commando.length( ); i++) {
			// si es un dígito
			if(Character.isDigit(commando.charAt(i))) {
				double numero;
				// obtener un string a partir del número
				String temp = "";
				for(j = 0; j < 100 && (Character.isDigit(
						commando.charAt(i)) || commando.charAt(i) == '.'); j++, i++) {
					temp = temp + commando.
							charAt(i);
				}
				// convertir a double y añadir a la pila
				numero = Double.parseDouble(temp);
				pushPila(numero);
			} else if(commando.charAt(i) == '+') {
				b = popPila( );
				a = popPila( );
				pushPila(a + b);
			} else if(commando.charAt(i) == '-') {
				b = popPila( );
				a = popPila( );
				pushPila(a - b);
			} else if(commando.charAt(i) == '*') {
				b = popPila( );
				a = popPila( );
				pushPila(a * b);
			} else if(commando.charAt(i) == '/') {
				b = popPila( );
				a = popPila( );
				pushPila(a / b);
			}else if(commando.charAt(i) == '^') {
				b = popPila( );
				a = popPila( );
				pushPila(Math.pow(a, b));
			}else if(commando.charAt(i) == '%') {
				b = popPila( );
				a = popPila( );
				pushPila(a%b);
			}else if(commando.charAt(i) != ' ') {
				throw new IllegalArgumentException( );
			}
		}
		double valor = popPila( );
		if(dato1 != null) {
			throw new IllegalArgumentException( );
		}
		return valor;
	}
	
}
