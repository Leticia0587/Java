package com.generation.conta_02.repository;

import com.generation.conta_02.model.Conta;

public interface ContaRepository {
	
	void inserir (Conta conta);
	int procurar(int numero);
	void visualizar(int posicao);
	void sacar(int posicao, float valor);
	

}
