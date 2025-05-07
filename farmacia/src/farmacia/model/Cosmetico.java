package farmacia.model;

public class Cosmetico extends produto{
	
	String fragancia;
	
	public Cosmetico(int id, String nome, String tipo, float preco, String fragancia) {
		super(id, nome, tipo, preco);
		this.fragancia=fragancia;
		
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Fragância: "+ fragancia);
		System.out.println("====================================================\n");
	}



}
