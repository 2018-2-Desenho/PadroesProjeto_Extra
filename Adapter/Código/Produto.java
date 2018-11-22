public class Produto {

		private int idProduto;
		private String nomeProduto;
		private double valor;
		
		public Produto(int idProduto, String nomeProduto, double valor) {
			this.idProduto = idProduto;
			this.nomeProduto = nomeProduto;
			this.valor = valor;
		}

		public int getIdProduto() {
			return idProduto;
		}

		public void setIdProduto(int idProduto) {
			this.idProduto = idProduto;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		
}
