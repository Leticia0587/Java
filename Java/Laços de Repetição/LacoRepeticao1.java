package Projeto57;

import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
	
		int num;
		
		try (Scanner leia = new Scanner (System.in)) {
			for (num=1000; num<=1999; num++) {
				
				if (num %11 == 5) {
					
					System.out.println("Os numeros de 1000 a 1999 divididos por 11 que tem resto igual a 5 sao: "+num);
	
				}

	}

}
	}
}
