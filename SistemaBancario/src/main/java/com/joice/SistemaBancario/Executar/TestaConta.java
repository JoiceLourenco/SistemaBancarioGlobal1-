package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Conta;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.agencia = 1;
		conta.banco = 234;
		conta.numero = "01945";
		conta.titular = "Global Code";
		conta.saldo = 10000D;
		
		System.out.println("----------------------------");
		System.out.println("AGENCIA: " + conta.agencia + "     BANCO: " + conta.banco);
		System.out.println("NUMERO : " + conta.numero);
		System.out.println("TITULAR: " + conta.titular);
		System.out.println("SALDO  : " + conta.saldo);
		System.out.println("----------------------------");

		
	}
	
		

}
