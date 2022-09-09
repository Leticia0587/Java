package Projeto57;

import java.util.Scanner;

public class LacoRepeticao3 {

	public static void main(String[] args) {
		
	    int idade;
		int cont21, cont50;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite sua idade: ");
			idade= leia.nextBoolean();
			
			if else (idade<21) {
				cont21++;
			}
			
			else (idade>50) {
				cont50++;
			}
		}while (idade=99);
		System.out.println("Fim do programa!");
	
	System.out.println("\nO total de pessoas com menos de 21 anos e: "+cont21);
	System.out.println("\nO total de pessoas com mais de 50 anos e: "+cont50);
	}
	


	


