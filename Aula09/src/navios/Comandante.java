package navios;

public class Comandante {
    private String nome;
    private int idade;
    private Navio navio;

    public Comandante(String nome, int idade, Navio navio) {
        this.nome = nome;
        this.idade = idade;
        this.navio = navio;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNavioNome() {
        return navio.getNome();
    }

    public double getNavioVelocidade() {
        return navio.getVelocidade();
    }

    public boolean getNavioAtracado() {
        return navio.isAtracado();
    }


    public void aumentarVelocidade(double quantidadeKm) {
        if (!navio.isAtracado()) {
            if (!(quantidadeKm <= 0) && !( (navio.getVelocidade() + quantidadeKm) >= 101) ) {
                System.out.println(navio.getNome() + ", velocidade atual: " + navio.getVelocidade() + ", aumentando a velocidade!");
                navio.aumentarVelocidade(quantidadeKm);
                System.out.println("Velocidade atual: " + navio.getVelocidade() + "\n");
                return;
            }
            System.out.println("Valor não permitido! \n");
            return;
        }
        System.out.println("Não é possível fazer isso com o navio atracado! \n");
    }

    public void diminuirVelocidade(double quantidadeKm) {
        if (!navio.isAtracado()) {
            if (!(quantidadeKm >= navio.getVelocidade())) {
                System.out.println(navio.getNome() + ", velocidade atual: " + navio.getVelocidade() + ", diminuindo a velocidade!");
                navio.diminuirVelocidade(quantidadeKm);
                System.out.println("Velocidade atual: " + navio.getVelocidade() + "\n");
                return;
            }
            System.out.println("Valor não permitido! \n");
            return;
        }
        System.out.println("Não é possível fazer isso com o navio atracado! \n");
    }

    public void atracarNavio() {
        if (navio.isAtracado()) {
            System.out.println("O " + navio.getNome() + " está se preparando para zarpar" );
            System.out.println("O " + navio.getNome() + " saiu do porto!" );
            navio.setVelocidade(20);
            System.out.println("Velocidade atual: " + navio.getVelocidade() + "\n");
            navio.setAtracado(false);
            return;
        }
        if (navio.getVelocidade() < 20) {
            navio.setVelocidade(0);
            System.out.println("O " + navio.getNome() + " está se preparando para atracar");
            System.out.println("O " + navio.getNome() + " entrou no porto!");
            System.out.println("Velocidade atual: " + navio.getVelocidade() + "\n");
            navio.setAtracado(true);
            return;
        }
        System.out.println("Não é possivel atracar com uma velocidade tão alta! \n");
    }
}
