package br.edu.ifpe.andrielly.gestaocliente1.model;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String endereco;
	private String cidade;
	private String uf;
	
	public Cliente(int codigo, String nome, String endereco, String cidade, String uf) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public Cliente() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	

}
