package com.generation.animal.model;

import com.generation.animal.Cachorro;
import com.generation.animal.Cavalo;
import com.generation.animal.Preguica;

public class Main {
	
	public static void main(String[ ] args) {
		
		Cachorro c = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica p = new Preguica();
		
		c.emitirSom();
		ca.emitirSom();
		p.emitirSom();
		
	}

}
