package farmacia.controller;

import java.util.ArrayList;
import java.util.Optional;

import farmacia.model.produto;
import farmacia.repository.produtoRepository;

public class produtoController implements produtoRepository{

	int numero = 0;
	ArrayList<produto> listaprod = new ArrayList<produto>();
	
	@Override
	public void cadastrar(produto produtos) {
		listaprod.add(produtos);
	}
	
	@Override
	public void listar_todos() {
		
		for (var produtos : listaprod) {
			produtos.visualizar();
			
		}
		
	}
	
	@Override
	public void consultarProdutoId(int id) {

		Optional<produto> prod = buscarID(id);
		if (prod.isPresent())
			prod.get().visualizar();
		else
			System.out.println("O produto não foi encontrado..");
		
	}
	
	@Override
	public void atualizarProduto(produto produtos) {
		
		Optional<produto> prod = buscarID(produtos.getId());
		
		if (prod.isPresent()) {
			listaprod.set(listaprod.indexOf(prod.get()), produtos);
			System.out.printf("A conta %d foi atualizada com sucesso!!\n",produtos.getId());
		}
	}
	
	@Override
	public void deletarProduto(int id) {
		 
		Optional<produto> prod = buscarID(id);
		
		if (prod.isPresent()) {
			if(listaprod.remove(prod.get())== true)
				System.out.printf("O produto com ID %d foi excluido com êxito!\n", id);
		}
		else 
			System.out.printf("O produto com ID %d não foi encontrado\n", id);
	}

	public int gerarID() {
		return ++ numero;
		
	}
	
	public Optional<produto> buscarID(int num) {
		for (var prod : listaprod) {
			if (prod.getId() == num) {
				return Optional.of(prod);
			}
		}
		return Optional.empty();
	}

	
	

}


