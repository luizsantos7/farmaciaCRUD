package farmacia.controller;

import java.util.ArrayList;

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
			produtos.visualizar(produtos);
			
		}
		
	}
	
	@Override
	public void consultarProdutoId(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void atualizarProduto(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deletarProduto(int id) {
		// TODO Auto-generated method stub
		
	}

	public int gerarID() {
		return ++ numero;
		
	}
	
	

}


