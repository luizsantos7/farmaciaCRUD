package farmacia.repository;

import farmacia.model.produto;

public interface produtoRepository {
	
	public void cadastrar(produto produto);
	
	public void listar_todos();
	
	public void consultarProdutoId(int id);
	
	public void atualizarProduto(produto produtos);
	
	public void deletarProduto(int id);
}
