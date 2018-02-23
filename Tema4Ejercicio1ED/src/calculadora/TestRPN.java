package calculadora;
import java.util.Scanner;

/**
 * 	Objetivo: Obtener código refactorizado a partir de otro que no lo está.
 *	Tarea: Para esta tarea, se refactorizará un programa mal escrito, sin
 *	cambiar la forma en que funciona el programa. Este programa, RPN.java
 *	es una calculadora de notación inversa polaca que utiliza una pila.
 *
 *	Reverse Polish notation (RPN) Notación Polaca inversa, por ejemplo
 *	la expresión: 4 * 5 - 7 / 2 % 3 nos da 1,5 respetando la prioridad de
 *	los operadores en notación RPN seria: 4 5 * 7 2 / - 3 % (pues no podemos
 *	poner los paréntesis para alterar la prioridad).
 *
 *	Se debe reorganizar este código usando al menos tres de las reglas
 *	vistas en clase.
 *
 * Calculadora Notacion Polaca Inversa.
 * @author Alexandru Eusebiu Chiriac
 * @version 23/2/2018 v 0.05
 *
 */

public class TestRPN {
	/**
	 * Metodo "main" de la aplicación.
	 * @param operacion Se le pasa la operación
	 */
	public static void main(String operacion[]) {
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce expresion Postfija o teclea \"fin\".");
					
			String linea = in.nextLine( );
			if("fin".equals(linea)) {
				System.out.println("Fin de programa");
				break;
			} else {
				RPN calc = new RPN(linea);
				System.out.printf("El resultado es %f\n",
						calc.resultado( ));
			}
		}while(true);
	}
} 