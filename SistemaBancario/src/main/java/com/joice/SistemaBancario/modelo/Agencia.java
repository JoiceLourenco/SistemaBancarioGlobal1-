package com.joice.SistemaBancario.modelo;

public class Agencia {
	
	private String numero;
	private int banco;

	
	public Agencia(String numero, int banco) {
		super();
		this.numero = numero;
		this.banco = banco;
	}

	
	public void imprimirDados () {
		System.out.println("----------------------");
	    System.out.println("Agencia nº. " + numero);
	    System.out.println("Banco nº." + banco);
	    System.out.println("----------------------");
	}
	
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
	public int getBanco() {return banco;}
	public void setBanco(int banco) {this.banco = banco;}

}
