package Projeto57;

import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
		
		int numero,x, par=0, impar=0;
		
		try (Scanner leia = new Scanner (System.in)) {
			for(x=1;x<=10;x++);
			{
				System.out.println("Entre com um numero: ");
				numero=leia.nextInt();
			
				if (numero%2 == 0);
				{  
					par++;
				}
				if (numero%2 == 1)
				{
					impar++;
				}
			}
		} System.out.println("Os numeros pares sao: "+par);
		  System.out.println("Os numeros impares sao: "+impar);

	}

}
