package Projeto57;

import java.util.Scanner;

public class LacosDecisao3 {

	public static void main(String[] args) {
		
		int idade;
		
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("Digite sua idade: ");
			idade= leia.nextInt();
		}
		if (idade<10) {
			System.out.println("Idade sem categiria.");
		}
		
		else if (idade<14) {
			System.out.println("Categoria Infantil.");
		}
		
		else if (idade<17) {
			System.out.println("Categoria Juvenil.");
		}
		
		else if (idade<25) {
			System.out.println("Categoria Adulto.");
		}
		
		
	}
		
		}


