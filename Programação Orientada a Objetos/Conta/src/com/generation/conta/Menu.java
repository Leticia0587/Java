package Conta.src.com.generation.conta;

import Conta.src.com.generation.conta.model.Banco;
import Conta.src.com.generation.conta.model.Conta;
import Conta.src.com.generation.conta.model.ContaCorrente;


public class Menu {
	
	public static void main(String[] args) {

		Conta c1 = new Conta(123456, "123", 1, "João da Silva", 2000.0f);
		c1.visualizar();

		ContaCorrente c2 = new ContaCorrente(123457, "123", 1, "Amanda Giacometti", 5000.0f, 500.0f);
		c2.visualizar();
		
		System.out.println("\n\nTestar Sacar");

		c1.sacar(100.0f);
		c1.visualizar();

		System.out.println("\n\nTestar Depositar");

		c2.depositar(100.0f);
		c2.visualizar();

		System.out.println("\n\nTesta Polimorfismo");
		
		ContaCorrente contaCorrente = new ContaCorrente(123457, "123", 1, "Luisa Amaral", 5000.0f, 500.0f);
		Banco banco = new Banco(contaCorrente);
		banco.getConta().visualizar();
	}

}