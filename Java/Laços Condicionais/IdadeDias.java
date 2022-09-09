package Projeto57;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		
		 int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
		
		 try (Scanner entrada = new Scanner (System.in)) {
			System.out.print("Digite os anos: ");
			IdadeAnos = entrada.nextInt();
			
			System.out.print("\nDigite os meses: ");
			IdadeMeses = entrada.nextInt();

			System.out.print("\nDigite os dias: ");
			IdadeDias = entrada.nextInt();
		}
				
				IdadeTotalDias = (IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias);
				System.out.print("\nIdade total em dias = "+IdadeTotalDias+"\n");

	}

}
