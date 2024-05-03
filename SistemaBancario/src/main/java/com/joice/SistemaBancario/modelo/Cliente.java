package com.joice.SistemaBancario.modelo;

public class Cliente {
	
	private String nome;
	private String cpf;
	
		public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
		
	public void imprimirDados () {
		System.out.println("----------------------");
	    System.out.println("Nome do cliente :" + nome);
	    System.out.println("CPF:" + cpf);
	    System.out.println("----------------------");
	}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getCpf() {return cpf;	}
	public void setCpf(String cpf) {this.cpf = cpf;}

}
