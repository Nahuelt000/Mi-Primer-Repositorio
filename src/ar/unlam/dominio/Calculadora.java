package ar.unlam.dominio;

public class Calculadora {
	private double numeroUno;
	private double numeroDos;
	public Calculadora(double numeroUno, double numeroDos) {
		this.numeroUno = numeroUno;
		this.numeroDos = numeroDos;
	}
	public double iniciarSuma() {
		double suma = this.numeroUno + numeroDos;
		return suma;
	}
	public double iniciarResta() {
		double resta = this.numeroUno - this.numeroDos;
		return resta;
	}
	public double iniciarDivision() {
		double division = this.numeroUno / this.numeroDos;
		return division;
	}
	public double iniciarMultiplicacion() {
		double multiplicacion = this.numeroUno * this.numeroDos;
		return multiplicacion;
	}
	public double getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(double numeroUno) {
		this.numeroUno = numeroUno;
	}
	public double getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(double numeroDos) {
		this.numeroDos = numeroDos;
	}
	
}
