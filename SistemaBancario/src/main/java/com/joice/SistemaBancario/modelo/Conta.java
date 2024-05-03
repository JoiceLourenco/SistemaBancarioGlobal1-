package com.joice.SistemaBancario.modelo;

public class Conta {
	
	private double saldo;
	private String numero;
	private String titular; 
	private int agencia;
	private int banco;
		
	
	public Conta(double saldo, String numero, String titular, int agencia, int banco) {
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.banco = banco;
	}

		public Conta(String numero, String titular, int agencia, int banco) {
		this.saldo = 0;
		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.banco = banco;
	}
	
		
	public void imprimirDados() {
		 System.out.println("----------------------------");
	        System.out.println("AGENCIA: " + agencia + "    BANCO: " + banco);
	        System.out.println("NUMERO : " + numero);
	        System.out.println("TITULAR: " + titular);
	        System.out.println("SALDO  : " + saldo);
	        System.out.println("----------------------------");
	}
	
	public void saque (double valor) {
		if(valor > 0){
			if( valor <= saldo) {
			saldo -= valor;
			imprimirDados();
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("O valor do saque precisa ser positivo.");
		}
	}
	
	
	public void deposito(double valor) {
		if(valor > 0) {
			saldo += valor;
			imprimirDados();
		}else {
			System.out.println("O valor do depósito precisa ser positivo.");
		}
	}
	
	
	public double getSaldo() {return saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public String getNumero() {return numero;	}
	public void setNumero(String numero) {this.numero = numero;}
	public String getTitular() {return titular;}
	public void setTitular(String titular) {this.titular = titular;}
	public int getAgencia() {return agencia;}
	public void setAgencia(int agencia) {this.agencia = agencia;}
	public int getBanco() {return banco;}
	public void setBanco(int banco) {this.banco = banco;}
	

}
