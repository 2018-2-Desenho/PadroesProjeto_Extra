
public class TesteMaps {
	
	public static void main (String[] args) {
		Trecho trecho1 = new TrechoRua("Siga na Rua augusta até encontrar o mercado e vire a direita", 500);
		Trecho trecho2 = new TrechoRua("Siga na Rua palmeiras até encontrar chegar no bosque gorduroso", 1500);
		Trecho trecho3 = new TrechoAvenida("Siga na avenida até a crateira empoeirada", 3000);
		Trecho trecho4 = new TrechoRodovia("Siga em frente e chega ao seu destino", 1500);
		
		Caminho caminho = new Caminho();
		caminho.adicionaTrecho(trecho1);
		caminho.adicionaTrecho(trecho2);
		caminho.adicionaTrecho(trecho3);
		caminho.adicionaTrecho(trecho4);
		System.out.println("Esse é o caminho:\n");
		caminho.imprimeCaminho();
	}
}
