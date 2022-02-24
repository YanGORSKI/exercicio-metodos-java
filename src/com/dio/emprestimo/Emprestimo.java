package com.dio.emprestimo;

public class Emprestimo {
	private double taxa;
	
	public void getEmprestimo(double valor, int parcelas) {
		setTaxa(parcelas);
		calculaEmprestimo(valor, parcelas, taxa);
	}
	
	private void calculaEmprestimo(double valor, int parcelas, double taxa) {
		double acrescimo = taxa*valor*parcelas;
		double montanteFinal = valor+acrescimo;
		double parcelaMes = montanteFinal/parcelas;
		System.out.println("O Valor inicial é de: R$ " + valor + "\n");		
		System.out.println("Com uma taxa de " + taxa*100 + "% ao mês" + "\n");		
		System.out.println("O valor final do empréstimo será de R$ " + montanteFinal + "\n");		
		System.out.printf("Com o pagamento de R$ " + "%.2f" + " por " + parcelas + " meses" + "\n", parcelaMes);		
		
	}

	private void setTaxa(int parcelas) {
		if(parcelas <= 6) {
			this.taxa = 0.005;
		}
		if((parcelas >= 7) && (parcelas <= 12)) {
			this.taxa = 0.007;
		}
		if((parcelas >= 13) && (parcelas <= 24)) {
			this.taxa = 0.01;
		}
		if(parcelas >= 25) {
			this.taxa = 0.015;
		}
	}
	
	
}