package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class Menu {
	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente(2,"132.654.984-01", "Fernando", "Rua dos pineiros, 346.", "Fernandodasilva@gmial.com", 984042157);
		cli.visualizar();
	}
}

