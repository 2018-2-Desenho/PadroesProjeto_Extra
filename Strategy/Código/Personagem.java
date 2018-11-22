
public class Personagem {
	
	private double pontosDeVida = 100;
	
	public void recebeDano(Monstro monstro) {
		this.pontosDeVida -= 5+(5*monstro.causaDano());
		System.out.println("Vida atual: " + this.pontosDeVida);
	}

	
}
