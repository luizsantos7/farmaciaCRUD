package farmacia;

import farmacia.model.Medicamento;

public class menu {

	public static void main(String[] args) {
		
		Medicamento m1 = new Medicamento(1, "Paracetamol", "Analgésico", 5.50f, "Sim");
		Medicamento m2 = new Medicamento(2, "Amoxicilina", "Antibiótico", 12.90f, "Sim");
		Medicamento m3 = new Medicamento(3, "Losartana", "Anti-hipertensivo", 8.30f, "Sim");
		Medicamento m4 = new Medicamento(4, "Omeprazol", "Antiulceroso", 10.00f, "Sim");
		Medicamento m5 = new Medicamento(5, "Neosaldina", "Analgésico/Antitérmico", 7.25f, "Não");

		
		System.out.println(m1.getNome());
	}

}
