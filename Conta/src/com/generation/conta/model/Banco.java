package com.generation.conta.model;

public class Banco {

		private Conta conta;

		public Banco(Conta conta) {
			this.conta = conta;
		}

		public Conta getConta() {
			return conta;
		}

		public void setConta(Conta conta) {
			this.conta = conta;
		}

}
