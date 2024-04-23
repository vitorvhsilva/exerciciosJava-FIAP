package rhempresa;

import rhempresa.dominio.Funcionario;
import rhempresa.dominio.Gerente;

public class Main {
    public static void main(String[] args) {
        new Funcionario("Vitor", "42424222211", 2000.0).holerite();
        new Gerente("Roberio", "3245202283", 12540.0, 23).holerite();

    }
}
