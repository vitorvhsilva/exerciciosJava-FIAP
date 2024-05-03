package fiapfolha.dominio;

import fiapfolha.servico.Autenticavel;

public class Auditor implements Autenticavel {
    @Override
    public void autenticar() {
        System.out.println("Autenticado");
    }
}
