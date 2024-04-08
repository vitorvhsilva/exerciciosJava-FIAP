package navios;

public class Navio {
    private String nome;
    private double velocidade;
    private boolean atracado;

    public Navio(String nome, double velocidade, boolean atracado) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.atracado = atracado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void aumentarVelocidade(double quantidadeKm) {
        if (!atracado) {
            if (!(quantidadeKm <= 0) && !( (velocidade + quantidadeKm) >= 101) ) {
                System.out.println(nome + ", velocidade atual: " + velocidade + ", aumentando a velocidade!");
                velocidade += quantidadeKm;
                System.out.println("Velocidade atual: " + velocidade + "\n");
                return;
            }
            System.out.println("Valor não permitido! \n");
            return;
        }
        System.out.println("Não é possível fazer isso com o navio atracado! \n");
    }

    public void diminuirVelocidade(double quantidadeKm) {
        if (!atracado) {
            if (!(quantidadeKm >= velocidade)) {
                System.out.println(nome + ", velocidade atual: " + velocidade + ", diminuindo a velocidade!");
                velocidade -= quantidadeKm;
                System.out.println("Velocidade atual: " + velocidade + "\n");
                return;
            }
            System.out.println("Valor não permitido! \n");
            return;
        }
        System.out.println("Não é possível fazer isso com o navio atracado! \n");
    }

    public void atracarNavio() {
        if (atracado) {
            System.out.println("O " + nome + " está se preparando para zarpar" );
            System.out.println("O " + nome + " saiu do porto!" );
            velocidade = 20;
            System.out.println("Velocidade atual: " + velocidade + "\n");
            atracado = false;
            return;
        }
        if (velocidade < 20) {
            velocidade = 0;
            System.out.println("O " + nome + " está se preparando para atracar");
            System.out.println("O " + nome + " entrou no porto!");
            System.out.println("Velocidade atual: " + velocidade + "\n");
            atracado = true;
            return;
        }
        System.out.println("Não é possivel atracar com uma velocidade tão alta! \n");
    }



}
