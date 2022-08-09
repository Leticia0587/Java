package Projeto57;

import java.util.Scanner;

public class LacoRepeticao6 {

	public static void main(String[] args) {
		
		float media;
		int num,somaMult3=0, contMult3=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um numero: ");
			num = leia.nextInt();
			
			if(num == 0) {
				System.out.println("\nVolte sempre!");
			}
			else
			{
				if(num %3 == 0) {
					somaMult3 += num;
					contMult3++;
				}
			}
		}
		while(num!=0);
		if(contMult3 == 0) {
			System.out.println("\nNao e possivel fazer a divisao por zero!");
		}
		else
		{
			media= somaMult3/ contMult3;
			System.out.println("\nMedia dos numeros multiplos de 3: "+media);
		}
	}

}
