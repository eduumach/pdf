package com.example.pdf.dados;

public class DadosCarteira {
	private String nome;
	private String sobrenome;
	private String para;
	private Integer idade;
	private Integer turma;

	public String getPara() {

		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getSobrenome() {

		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {

		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {

		return idade;
	}

	public void setIdade(Integer idade) {

		this.idade = idade;
	}

	public Integer getTurma() {

		return turma;
	}

	public void setTurma(Integer turma) {

		this.turma = turma;
	}
}
