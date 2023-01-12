package br.com.modelo;

public class Dog {
	private String nome, raca;
	private int idade, id;
	
	public Dog(String nome, String raca, int idade) {
		this.idade = idade;
		this.nome = nome;
		this.raca = raca;
	}
	
	public int getId() {
		return id;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

}
