
public class TrechoRodovia implements Trecho{
	
	private String descricao;
	private int distancia;
	
	public TrechoRodovia(String descricao, int distancia) {
		this.descricao = descricao;
		this.distancia = distancia;
	}
	
	public void imprimeCaminho(){
		System.out.println("Descri��o: " + this.descricao + "m\n");
		System.out.println("Dist�ncia: " + this.distancia + "m\n");
	}
	
}
