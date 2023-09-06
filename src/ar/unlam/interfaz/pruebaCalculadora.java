package ar.unlam.interfaz;
import java.util.Scanner;
import ar.unlam.dominio.*;
public class pruebaCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		mostrarMensajePorConsola("Ingrese el primer numero : ");
		double numeroUno = teclado.nextDouble();
		mostrarMensajePorConsola("Ingrese el segundo numero : ");
		double numeroDos = teclado.nextDouble();
		Calculadora miCalculadora = new Calculadora(numeroUno, numeroDos);
	}
	private static void mostrarMensajePorConsola(String mensaje) {
		System.out.println(""+mensaje);
	}
}
