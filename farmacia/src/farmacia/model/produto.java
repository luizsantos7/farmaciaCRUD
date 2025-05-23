package farmacia.model;

import java.text.NumberFormat;

public abstract class produto {
	
	int id;
	String nome;
	String tipo;
	float preco;
	
	public produto(int id, String nome, String tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public void visualizar() {
			
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		System.out.println("====================================================");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("ID de Consulta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Valor: " + nfMoeda.format(this.preco));
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
