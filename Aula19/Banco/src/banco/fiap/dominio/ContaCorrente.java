package banco.fiap.dominio;

public class ContaCorrente {
	private int banco;
	private String agencia;
	private String numero;
	private double saldo;

	public ContaCorrente(int banco, String agencia,
						 String numero, double saldo){
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	public void saque(double valor){
		if(valor > saldo) {
			throw new IllegalArgumentException("Valor do saque maior que o saldo atual. Saque não realizado");
		}
		else {
			saldo = saldo - valor;
		}
	}

	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	public double saldo() {
		return saldo;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof ContaCorrente)) return false;
		ContaCorrente outra = (ContaCorrente)obj;
        return banco == outra.banco
                && agencia.equals(outra.agencia)
                && numero.equals(outra.numero);
    }
}
