package Projeto57;

import java.util.Scanner;

public class LacosDecisao1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		try (Scanner ler = new Scanner (System.in)){
		System.out.println("Digite um numero: ");
		a = ler.nextInt();
		System.out.println("\nDigite um numero: ");
		b = ler.nextInt();
		System.out.println("\nDigite um numero: ");
		c = ler.nextInt();
		}
		
		if (a>b && a>c) {
			System.out.println("\nO maior numero e: "+a);
		}else if (b>a && b>c) {
			System.out.println("\nO maior número e: "+b);
		}else if(c>a && c>b) {
			System.out.println("\nO maior numero e: "+c);
		}
		}
		
	}


