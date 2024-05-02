package com.joice.SistemaBancario.modelo;

public class Conta {
	
	public double saldo;
	public String numero;
	public String titular; 
	public int agencia;
	public int banco;
	
	public void inicializarConta (double saldoInicial, String num, String tit, int ag, int bc) {
		saldo = saldoInicial;
		numero = num;
		titular = tit;
		agencia = ag;
		banco = bc;
	}
	
	public void imprimirDados() {
		 System.out.println("----------------------------");
	        System.out.println("AGENCIA: " + agencia + "    BANCO: " + banco);
	        System.out.println("NUMERO : " + numero);
	        System.out.println("TITULAR: " + titular);
	        System.out.println("SALDO  : " + saldo);
	        System.out.println("----------------------------");
	}
	
	public void saque(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo =- valor;
			imprimirDados();
		}else {
			System.out.println("Não foi possível realizar o saque.");
		}
	}
	
	
	public void deposito(double valor) {
		if(valor > 0) {
			saldo =+ valor;
			imprimirDados();
		}else {
			System.out.println("o valor do depósito precisa ser positivo.");
		}
	}

}
