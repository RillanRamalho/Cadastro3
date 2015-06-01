package Controle;

import java.util.List;
import Acesso.ProdutoAcesso;
import Entidade.ProdutoEntidade;
public class ControleProduto {

	public void salvar(ProdutoEntidade produto) {
		new ProdutoAcesso().salvar(produto);
	}

	public void excluir(ProdutoEntidade produto) {
		new ProdutoAcesso().excluir(produto);
	}

	public List<ProdutoEntidade> listar() {
		return new ProdutoAcesso().listar();
	}

	public ProdutoEntidade buscaRegistro(int valor) {
		return new ProdutoAcesso().buscaRegistro(valor);
	}	
}
