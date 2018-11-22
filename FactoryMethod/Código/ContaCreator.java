
public class ContaCreator {
	public int codigoCoreia = 0;
	public int codigoBrasil = 1;
	
	public Conta criaConta(int codigoPais, String email, String senha) {
		if (codigoPais == this.codigoCoreia) {
			System.out.println("Conta da Coréia criada!!");
			return new ContaCoreia(email, senha);
		}
		if (codigoPais == this.codigoBrasil) {
			System.out.println("Conta do Brasil criada!!");
			return new ContaBrasil(email, senha);
		}
		throw new IllegalArgumentException (" Tipo de Conta não existe!!") ;

		
	}
}
