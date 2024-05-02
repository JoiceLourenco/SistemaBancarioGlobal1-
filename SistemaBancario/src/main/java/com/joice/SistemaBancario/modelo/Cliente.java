package com.joice.SistemaBancario.modelo;

public class Cliente {
	
	public String nome;
	public String cpf;
	
	
	public void inicializaCliente (String nomeCliente, String cpfCliente) {
		nome = nomeCliente;
		cpf = cpfCliente;
	}
	
	
	public void imprimirDados () {
		System.out.println("----------------------");
	    System.out.println("Nome do cliente :" + nome);
	    System.out.println("CPF:" + cpf);
	    System.out.println("----------------------");
	}

}
