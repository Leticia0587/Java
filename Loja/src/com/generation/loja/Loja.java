package com.generation.loja;

import java.util.ArrayList;

public class Loja {
	

		    public static void main(String[] args)
		    {
		        ArrayList <String> itens = new ArrayList<String>();

		        itens.add("Blusa");
		        itens.add("Calça jeans");
		        itens.add("Jaqueta de couro");
		        itens.add("Vestido");
		        itens.add("Saia");
		        itens.add("Shorts");

		        System.out.println(itens.toString());

		        itens.remove(4);
		        System.out.println(itens.toString());

		        itens.set(2,"Calça jeans");
		        System.out.println(itens.toString());
		        
		        itens.remove(1);
		        System.out.println(itens.toString());
		        
		        itens.set(3,"Jaqueta de couro");
		        System.out.println(itens.toString());



		    }

}
