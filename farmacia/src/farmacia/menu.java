package farmacia;

import java.io.IOException;
import java.util.Scanner;

import farmacia.controller.produtoController;
import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;

public class menu {

	public static void main(String[] args) {
		

		produtoController prod = new produtoController();
		
		prod.cadastrar(new Medicamento(prod.gerarID(), "Paracetamol", "Analgésico", 5.50f, "n"));
		prod.cadastrar(new Cosmetico(prod.gerarID(), "Hidratante Nivea", "Loção Corporal", 18.90f, "Baunilha"));
		
		Scanner leia = new Scanner(System.in)
				;
		String tipo, nome, fragancia, generico;
		float preco;
		int opcao=0;
		
		while(true) {
			System.out.println("Seja bem vindo ao sistema Farma-CRUD");
			System.out.println("\n=== MENU PRINCIPAL ===");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Atualizar produto");
			System.out.println("3 - Consultar produto");
			System.out.println("4 - Deletar produto");
			System.out.println("5 - Listar produtos");
			System.out.println("0 - Sair\n");
			System.out.println("Digite opção escolhida: ");
			opcao = leia.nextInt();
			
			
			if(opcao == 0)
				
				finalizar();
			
			switch(opcao) {
				case 1:
					do {
						System.out.println("Você está realizando um cadastro de um item!");
						System.out.println("Será um Cosmético ou Medicamento?");
						leia.skip("\\R");
						tipo = leia.next();				
						
						//if e else para seguir o objeto desejado
						if(tipo.equalsIgnoreCase("cosmético") || tipo.equalsIgnoreCase("cosmetico")) {
							
							System.out.println("Por favor, informe o nome do Cosmético:");
							nome = leia.next();
							
							System.out.println("Digite o valor desejado para o cosmético: ");
							preco = leia.nextFloat();
							
							System.out.println("Digite a fragância do cosmético: ");
							leia.skip("\\R");
							fragancia = leia.next();
							
							//usei o prod controller para usar o metodo cadastrar, onde ele cria um novo cosmetico e o adiciona a Arraylist criada na classe controller
							prod.cadastrar(new Cosmetico(prod.gerarID(),nome, tipo, preco, fragancia));
							
							System.out.println("Cosmético criado!! -- Deseja continuar? (s/n)");
							String alternativa = leia.next();
							
							if (alternativa.equalsIgnoreCase("n") || alternativa.equalsIgnoreCase("não") || alternativa.equalsIgnoreCase("nao")) {
								System.out.println("Criação finalizada!!");
								keyPress();
								break;
								
								}
							}
						
						else if (tipo.equalsIgnoreCase("medicamento")) {
							
							System.out.println("Por favor, informe o nome do medicamento:");
							nome = leia.next();
							
							System.out.println("Digite o valor desejado para o medicamento: ");
							preco = leia.nextFloat();
							
							System.out.println("Este é um produt Genérico? (s/n)");
							leia.skip("\\R");
							generico = leia.next();
							
							//usei o prod controller para usar o metodo cadastrar, onde ele cria um novo cosmetico e o adiciona a Arraylist criada na classe controller
							prod.cadastrar(new Medicamento(prod.gerarID(),nome, tipo, preco, generico));
							
							System.out.println("Cosmético criado!! -- Deseja continuar? (s/n)");
							String alternativa = leia.next();
							
							if (alternativa.equalsIgnoreCase("n") || alternativa.equalsIgnoreCase("não") || alternativa.equalsIgnoreCase("nao")) {
								System.out.println("Criação finalizada!!");
								keyPress();
								break;
								
								}

						}
							
						else
							System.out.println("Escolha inválida, por favor tente novamente.");
							
					}while(true);
						
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					prod.listar_todos();
					keyPress();
					break;
				case 6:
					break;
				default:
					break;
			}
			

		}
	}
	
	public static void keyPress() {
		 
		try {
 
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
 
		} catch (IOException e) {
 
			System.err.println("Ocorreu um erro ao tentar ler o teclado");
 
		}
	}
	
	public static void finalizar() {
		System.out.println("================================================");
		System.out.println("\nObrigado por testar o meu projeto.\nDesenvolvedor: Luiz Henrique dos Santos.\nGithub: https://github.com/luizsantos7 \n");
		System.out.println("================================================");
		System.exit(0);
	}
	

}
