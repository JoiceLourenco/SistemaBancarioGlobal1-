package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Cliente;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "GlobalCode";
		cliente.cpf = "123154";
		
		System.out.println("----------------------------");
		System.out.println("NOME: " + cliente.nome + "     CPF: " + cliente.cpf);
		System.out.println("----------------------------");

		
		
	}

}
