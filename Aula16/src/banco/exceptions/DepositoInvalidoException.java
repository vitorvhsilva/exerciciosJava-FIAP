package banco.exceptions;

public class DepositoInvalidoException extends Exception{
    public DepositoInvalidoException(String erro) {
        super(erro);
    }
}
