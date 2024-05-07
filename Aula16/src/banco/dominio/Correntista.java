package banco.dominio;

public class Correntista {

	private String nome;
	private String cpf;
	private ContaCorrente contaCorrente;
	
	public Correntista(String nome, String cpf,
			ContaCorrente contaCorrente){
		this.nome = nome;
		this.cpf = cpf;
		this.contaCorrente = contaCorrente;
	}
	
	void transferencia(double valor,
			ContaCorrente contaSacada,
			ContaCorrente contaCreditada) {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void alterarNome(String novoNome) {	
		if(novoNome != null && novoNome.length() >= 3 && !novoNome.isBlank()) {
			this.nome = novoNome;
			return;
		}
		System.out.println("Não foi possível alterar o nome");
	}
}
