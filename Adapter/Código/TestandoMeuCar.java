
public class TestandoMeuCar {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "Pasta de dente", 5.99);
		Produto produto2 = new Produto(2, "Bala Fini", 4.99);
		Produto produto3 = new Produto(3, "Filme Birdemic", 29.99);
		
		CarrinhoAntigo carrinho1 = new CarrinhoAdapter();
		CarrinhoAntigo carrinho2 = new CarrinhoAdapter();
		
		System.out.println("Iniciando carrinho 1\n---------------------\n");
		carrinho1.adicionarProduto(produto1);
		carrinho1.adicionarProduto(produto2);
		carrinho1.adicionarProduto(produto3);
		carrinho1.retirarProduto(produto1);
		carrinho1.finalizarCompra();
		System.out.println("\n---------------------\n");
		
		System.out.println("Iniciando carrinho 2\n---------------------\n");
		carrinho2.adicionarProduto(produto1);
		carrinho2.adicionarProduto(produto2);
		carrinho2.adicionarProduto(produto3);
		carrinho2.retirarProduto(produto2);
		carrinho2.retirarProduto(produto3);
		carrinho2.finalizarCompra();
		System.out.println("\n---------------------\n");
		

	}

}
