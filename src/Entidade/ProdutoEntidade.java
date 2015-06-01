package Entidade;

public class ProdutoEntidade {
	private int Codigo;	
	private String Produto;
	private int Estoque;
	private double Preco;
	private String Fornecedor;
	
	public String getProduto() {
		return Produto;
	}

	public double getPreco() {
		return Preco;
	}

	public int getEstoque() {
		return Estoque;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}

	public void setProduto(String Produto) {
		this.Produto = Produto;
	}

	public void setPreco(double Preco) {
		this.Preco = Preco;	
	}

	public void setEstoque(int Estoque) {
		this.Estoque = Estoque;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

}
