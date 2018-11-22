
public class ContaCoreia implements Conta{
	
	private String email;
	private String senha;
	
	public ContaCoreia(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public void fazerLogin() {
		System.out.println("Login realizado com sucesso na conta da Coréia\n");
		System.out.println("email: " + this.email + "\n");
		System.out.println("senha: "+this.senha+"\n");
	}

}
