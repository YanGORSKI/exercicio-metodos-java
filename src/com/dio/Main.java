package com.dio;

import java.util.Scanner;

import com.dio.calculadora.Calculadora;
import com.dio.mensagem.Mensagem;
import com.dio.emprestimo.Emprestimo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("O que deseja fazer?\n");
		System.out.println("1 - Calculadora\n");
		System.out.println("2 - Mensagem\n");
		System.out.println("3 - Empréstimo\n");
		int escolha = scan.nextInt();
		
//		Calculadora
		if(escolha == 1) {
			System.out.println("Calculadora \n\n");
			System.out.println("Que operação deseja fazer?\n( + - * / )\n");
			String operacao = scan.next();
			System.out.println("\nDigite o primeiro número: ");
			double x = scan.nextDouble();
			System.out.println("\nDigite o segundo número: ");
			double y = scan.nextDouble();
			
//			Soma
			if(operacao.equals("+")) {
				Calculadora.soma(x, y);
			}
//			Subtração
			else if(operacao.equals("-")) {
				Calculadora.subtracao(x, y);
			}
//			Multiplicação
			else if(operacao.equals("*")) {
				Calculadora.multiplicacao(x, y);
			}
//			Divisão
			else if(operacao.equals("/")) {
				Calculadora.divisao(x, y);
			}
//			Erro
			else {
				System.out.println("\nComando inválido. Tente novamente");
			}
		}
		
//		Mensagem
		else if(escolha == 2) {
			System.out.println("Mensagem \n\n");
			System.out.println("Que horas são? (24h)\n");
			int hora = scan.nextInt();
			Mensagem.getMensagem(hora);
			
		}
//		Empréstimo
		else if(escolha == 3) {
			Emprestimo emprestimo = new Emprestimo();
			System.out.println("Empréstimo \n\n");
			System.out.println("Qual o valor do empréstimo?\nR$ ");
			double valor = scan.nextDouble();
			System.out.println("\nEm quantas parcelas pretende pagar? \n");
			int parcelas = scan.nextInt();
			emprestimo.getEmprestimo(valor, parcelas);
						
		
		}
//		Erro
		else {
			System.out.println("Escolha uma opção válida");
		}
	}

}
