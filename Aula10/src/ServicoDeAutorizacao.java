import java.util.ArrayList;

public class ServicoDeAutorizacao {

    ArrayList<String> nomeTrabalhadores;
    ArrayList<Cartao> Cartoes;
    String nome;
    int numero;
    double valor;

    public ServicoDeAutorizacao(ArrayList<String> nomeTrabalhadores, ArrayList<Cartao> Cartoes,
                                String nome, int numero, double valor) {
        this.nomeTrabalhadores = nomeTrabalhadores;
        this.Cartoes = Cartoes;
        this.nome = nome;
        this.numero = numero;
        this.valor = valor;
    }

    public void autorizarTransacao() {
        for (int i = 0; i < nomeTrabalhadores.size(); i++) {
            if (nome.equals(nomeTrabalhadores.get(i)) && (numero ==  Cartoes.get(i).getNumero())){
                if  (valor <=  Cartoes.get(i).getValor()) {
                    System.out.println("Autorizado");
                    return;
                }
                System.out.println("Saldo menor que a transação!");
                return;
            }
            System.out.println("O Cartão não existe no registro!");
        }
    }
}
