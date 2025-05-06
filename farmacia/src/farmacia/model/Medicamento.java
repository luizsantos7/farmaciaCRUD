package farmacia.model;

public class Medicamento extends produto {

	String generico;
	
	public Medicamento(int id, String nome, String tipo, float preco, String generico) {
		super(id, nome, tipo, preco);
		// TODO Auto-generated constructor stub
	}
	
	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}
	
}
