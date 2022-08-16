package com.generation.funcionario.model;

public class Funcionario {
	
	private int id;
	private String nome;
	private String cpf;
	private String cargo;
	private String funcao;
	private String cargaHoraria;
	private double dataAdmissao;
	
	public Funcionario(int id, String nome, String cpf, String cargo, String funcao, String cargaHoraria,
			double dataAdmissao) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.funcao = funcao;
		this.cargaHoraria = cargaHoraria;
		this.dataAdmissao = dataAdmissao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getDataAdmisao() {
		return dataAdmissao;
	}

	public void setDataAdmisao(double dataAdmisao) {
		this.dataAdmissao = dataAdmisao;
	}
	
	public void visualizar() {
		System.out.println("\nCodigo do funcionario: " +id);
		System.out.println("\nNome: " +nome);
		System.out.println("\nCPF: " +cpf);
		System.out.println("\nCargo: " +cargo);
		System.out.println("\nFuncao: " +funcao);
		System.out.println("\nCarga Horaria: " +cargaHoraria);
		System.out.println("\nData de Adimissao:: " +dataAdmissao);
	}
	

}
