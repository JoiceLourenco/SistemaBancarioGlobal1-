package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Agencia;

public class TestaAgencia {
	
	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		agencia.numero = "01";
		agencia.banco = 234;
		
		System.out.println("----------------------------");
		System.out.println("AGENCIA: " + agencia.numero + "     BANCO: " + agencia.banco);
		System.out.println("----------------------------");
		
	}

}
