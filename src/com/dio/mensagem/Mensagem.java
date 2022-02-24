package com.dio.mensagem;
public class Mensagem {
	
	public static void getMensagem(int hora) {
		if((hora >= 5) && (hora <= 11)) {
			bomDia();
		}
		if ((hora >= 12) && (hora <= 18)) {
			boaTarde();
		}
		if (((hora >= 19) && (hora <= 24)) || ((hora >= 0) && (hora <= 4))) {
			boaNoite();
		}
		if(hora > 24) {
			System.out.println("Hora inválida");
		}
	}

	public static void bomDia() {
		System.out.println("Bom Dia!");
	}
	public static void boaTarde() {
		System.out.println("Boa Tarde!");
	}
	public static void boaNoite() {
		System.out.println("Boa Noite!");
	}
}