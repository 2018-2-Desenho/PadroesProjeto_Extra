
public class CarrinhoAdapter extends CarrinhoAntigo{
	private CarrinhoNovo carrinhoNovo;
	
	public CarrinhoAdapter() {
		this.carrinhoNovo = new CarrinhoNovo();
	}
	
	public void adicionaProduto(Produto produto) {
		this.carrinhoNovo.gerenciarProduto(produto, true);
	}
	
	public void retiraProduto(Produto produto) {
		this.carrinhoNovo.gerenciarProduto(produto, false);
	}

}
