package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Agencia;

public class TestaAgencia {
	
	public static void main(String[] args) {
		
		Agencia agencia = new Agencia("234", 1);
		
		System.out.println("----------------------------");
		System.out.println("AGENCIA: " + agencia.getNumero() + "     BANCO: " + agencia.getBanco());
		System.out.println("----------------------------");
		
		
	}

}
