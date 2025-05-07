package farmacia.model;

public class Medicamento extends produto {

	private int generico;
	
	public Medicamento(int id, String nome, String tipo, float preco, int generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
		// TODO Auto-generated constructor stub
	}
		
	public int getGenerico() {
		return generico;
	}




	public void setGenerico(int generico) {
		this.generico = generico;
	}


	@Override
	public void visualizar() {
		super.visualizar();
		String tipo = "";
		
		switch(this.generico) {
			case 1:
				tipo = "Genérico";
				break;
			case 2:
				tipo = "Não Genérico";
				break;
			default:
				tipo = "Não informado, por favor registre novamente";
				break;
		}
		
		System.out.println("Produto: "+ tipo);
		System.out.println("====================================================\n");
	}
	
}
