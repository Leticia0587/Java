package Projeto57;

import java.util.Scanner;

public class ArrayMatriz1 {

	public static void main(String[] args) {
		
		 int matriz[][]= new int[3][3];
		 int x,y,cont10=0;
		 
		 Scanner leia = new Scanner(System.in);{
		 
		 for (x=0; x<3; x++) {
			 for (y=0; y<3; y++) {
				 System.out.println("\nDigite um numero: ");
				 matriz[x][y]= leia.nextInt();
				 
				 if(matriz[x][y]>=10) {
					 cont10++;
				 }
			 }
		 }
		 System.out.println("\nA quantidade de valores maior que 10 e de: "+cont10);
  }
}
}
		 
