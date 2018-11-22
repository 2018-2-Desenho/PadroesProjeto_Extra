
public class CarrinhoNovo {

	public void gerenciarProduto(Produto produto, boolean eAdicao) {
		if(eAdicao== true) {
			System.out.println("Adicionando produto: " + produto.getNomeProduto() + "\n");
			System.out.println("Valor: " + produto.getValor() + "\n");
		} else {
			System.out.println("Removendo produto: " + produto.getNomeProduto() + "\n");
			System.out.println("Valor: " + produto.getValor() + "\n");
		
		}
	}
	
	public void finalizarCompra() {
		System.out.println("Compra finalizada!!!");
	}
}
