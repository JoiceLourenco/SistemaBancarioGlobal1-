package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Conta;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(2000D, "3346", "Luciano Oliveira", 334, 1);
		
		conta.imprimirDados();
		conta.saque(5);
		conta.deposito(10);
		
	}
	
}
