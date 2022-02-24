package com.dio.calculadora;

public class Calculadora {

	public static void soma(double a, double b) {
		double resultado = a+b;
		
		System.out.println((int)a + " + " + (int)b + " = " + resultado);
	}
	public static void subtracao(double a, double b) {
		double resultado = a-b;
		System.out.println((int)a + " - " + (int)b + " = " + resultado);
	}
	public static void multiplicacao(double a, double b) {
		double resultado = a*b;
		System.out.println((int)a + " x " + (int)b + " = " + resultado);
	}
	public static void divisao(double a, double b) {
		double resultado = a/b;
		System.out.println((int)a + " / " + (int)b + " = " + resultado);
	}
}