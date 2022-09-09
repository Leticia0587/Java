package Projeto57;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Double n1,n2,n3,media;
		
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Entre com a primeira nota: ");
			n1 = ler.nextDouble();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = ler.nextDouble();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = ler.nextDouble();
			media = (n1+n2+n3)/3;
		}
		System.out.println("\nMedia: "+media);
		
	}

}
