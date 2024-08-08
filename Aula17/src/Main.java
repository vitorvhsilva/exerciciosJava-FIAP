import bd.ConnectionFactory;
import bd.FuncionariosService;
import bd.ProfessoresService;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection conexao = factory.obterComunicacao("jdbc:h2:./banco/bancoDeDados",
                "sa", "");

        FuncionariosService funcionariosService = new FuncionariosService(conexao);

        funcionariosService.deletaTabFunc();
        funcionariosService.criaTabFunc();
        funcionariosService.inserirDadosTabFunc("Vitor", "12345", 2006, 3, 28);

        ProfessoresService professoresService = new ProfessoresService(conexao);

        professoresService.deletaTabProf();
        professoresService.criaTabProf();
        professoresService.inserirDadosTabProf("Rodrigao", 1223344312.0);

        factory.fecharComunicacao(conexao);
    }
}