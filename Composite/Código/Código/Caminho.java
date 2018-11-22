import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho{
	
	private List<Trecho> trechos = new ArrayList<Trecho>();
	
	public void adicionaTrecho(Trecho trecho) {
		this.trechos.add(trecho);
	}
	
	public void removeTrecho(Trecho trecho) {
		this.trechos.remove(trecho);
	}
	
	public void imprimeCaminho() {
		for (Trecho trecho: this.trechos) {
			trecho.imprimeCaminho();
		}
	}
	
	

}
