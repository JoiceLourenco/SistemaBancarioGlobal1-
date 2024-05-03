package com.joice.SistemaBancario.Executar;

import com.joice.SistemaBancario.modelo.Conta;

public class TestaSobrecarga {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(3000D, "6679-8", "Laura Viana", 234, 1);
		c1.imprimirDados();
		Conta c2 = new Conta("8970-X", "Laura Marques", 234, 1);
		c2.imprimirDados();
		
	}

}
