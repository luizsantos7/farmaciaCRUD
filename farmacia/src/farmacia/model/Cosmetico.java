package farmacia.model;

public class Cosmetico extends produto{
	
	String fragancia;
	
	public Cosmetico(int id, String nome, String tipo, float preco, String fragancia) {
		super(id, nome, tipo, preco);
		
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}



}
