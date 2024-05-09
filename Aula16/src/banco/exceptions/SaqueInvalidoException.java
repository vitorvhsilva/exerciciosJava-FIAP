package banco.exceptions;

public class SaqueInvalidoException extends RuntimeException{
    public SaqueInvalidoException(String erro) {
        super(erro);
    }
}
