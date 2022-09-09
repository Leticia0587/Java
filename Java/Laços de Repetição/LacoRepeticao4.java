package Projeto57;

import java.util.Scanner;

public class LacoRepeticao4 {

	public static void main(String[] args) {
	
		int idade,genero,psico,contpc=0,contmn=0,contha=0,contbc=0,contpn40=0,contpc18=0,p=1;
		
		Scanner leia=new Scanner (System.in);
		
        while (p<=5) {
        	System.out.println("Digite sua idade: ");
        	idade = leia.nextInt();
        	System.out.println("\nEntre com seu genero: \n1- Feminino \n2- Masculino \n3- Outro ");
        	genero = leia.nextInt();
        	System.out.println("\nEntre com o fator psicologico: \n1- Calma \n2- Nervosa \n3- Agressiva");
        	psico = leia.nextInt();
        	
        	if(psico == 1) {
        		contpc++;
        	}
        	
        	if(genero == 1 && psico ==2) {
        		contmn++;
        	}
        	
        	if(genero == 2 && psico ==3) {
                contha++;
        	}
        	
        	if(genero == 3 && psico == 1) {
        		contbc++;
        	}
        	
        	if(psico == 2 && idade>40) {
        		contpn40++;
        	}
        	
        	if(psico == 2 && idade<18) {
        		contpc18++;
        	}
        	p++;
        }
        System.out.print("Numero de pessoas calmas: "+contpc);
        System.out.print("\nNumero de mulheres nervosas: "+contmn);
        System.out.print("\nNumero de homens agressivos: "+contha);
        System.out.print("\nNumero de pessoas (outros) calmas: "+contbc);
        System.out.print("\nNumero de pessoas com mais de 40 anos: "+contpn40);
        System.out.print("\nNumero de pessoas calmas com menos de 18 anos: "+contpc18);
	}

}
