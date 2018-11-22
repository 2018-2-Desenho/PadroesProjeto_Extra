
public class TestaDano {

	public static void main(String[] args) {
		
		Personagem mi = new Personagem();
		Personagem mau = new Personagem();
		
		Monstro ambulanciaLondres = new MonstroAgua();
		Monstro paiDaMi = new MonstroFogo();

		System.out.println("Dano no mau:\n");
		mau.recebeDano(paiDaMi);
		mau.recebeDano(paiDaMi);
		mau.recebeDano(paiDaMi);
		
		System.out.println("\nDano na mi:\n");
		mi.recebeDano(paiDaMi);
		mi.recebeDano(ambulanciaLondres);
		
	}

}
