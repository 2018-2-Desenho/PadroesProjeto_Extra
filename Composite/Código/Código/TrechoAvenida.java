
public class TrechoAvenida implements Trecho{

	private String descricao;
	private int distancia;
	
	public TrechoAvenida(String descricao, int distancia) {
		this.descricao = descricao;
		this.distancia = distancia;
	}
	
	public void imprimeCaminho(){
		System.out.println("Descrição: " + this.descricao + "m\n");
		System.out.println("Distância: " + this.distancia + "m\n");
	}
	
}
