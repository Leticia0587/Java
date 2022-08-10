package Projeto57;

import java.util.Scanner;

public class ArrayVetor1 {

	public static void main(String[] args) {
		
	  int A[] = new int [6];
	  A[0]= 1;
	  A[1]= 0;
	  A[2]= 5;
	  A[3]= -2;
	  A[4]= -5;
	  A[5]= 7;
      int soma,i;
      
      Scanner ler = new Scanner(System.in);
      soma= A[0]+ A[1]+ A[5];
      System.out.println("A soma da posicao 0,1 e 5= "+soma);

      A[4] = 100;
      
      for(i = 0; i < 6; i++) {
         System.out.println("\nNa posicao "+i+" temos o valor: "+A[i]);
      }
         
	}

}
