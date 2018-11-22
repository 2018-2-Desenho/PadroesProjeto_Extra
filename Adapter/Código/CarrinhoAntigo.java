
public class CarrinhoAntigo {
	
	public void adicionarProduto(Produto produto) {
		System.out.println("Adicionando produto: " + produto.getNomeProduto() + "\n");
		System.out.println("Valor: " + produto.getValor() + "\n");
	}
	
	public void retirarProduto(Produto produto) {
		System.out.println("Removendo produto: " + produto.getNomeProduto() + "\n");
		System.out.println("Valor: " + produto.getValor() + "\n");
	}
	
	public void finalizarCompra() {
		System.out.println("Compra finalizada!!!");
	}
}
