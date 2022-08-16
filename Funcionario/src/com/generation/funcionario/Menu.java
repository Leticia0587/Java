package com.generation.funcionario;

import com.generation.funcionario.model.Funcionario;

public class Menu {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario(10,"Julia", "356.472.655-02", "Asssinte Administrativo", "Acompanhamento e controle das rotinas de trabalho das empresas e organizações.", "Oito horas",16/05/2020);
		fun.visualizar();
	}

}
