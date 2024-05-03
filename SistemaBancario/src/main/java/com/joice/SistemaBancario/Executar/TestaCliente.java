package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Cliente;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Patricia Borges", "123.456.789-10");
		
		System.out.println("---------------------------------");
		System.out.println("NOME: " + cliente.getNome() + "     CPF: " + cliente.getCpf());
		System.out.println("---------------------------------");

	}

}
