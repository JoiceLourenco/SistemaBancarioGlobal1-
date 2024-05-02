package com.joice.SistemaBancario.modelo;

public class Agencia {
	
	public String numero;
	public int banco;
	
	public void inicializarAgencia( String numAgencia, int bancoAgencia) {
		numero = numAgencia;
		banco = bancoAgencia;
	}
	
	public void imprimirDados () {
		System.out.println("----------------------");
	    System.out.println("Agencia nº. " + numero);
	    System.out.println("Banco nº." + banco);
	    System.out.println("----------------------");
	}

}
