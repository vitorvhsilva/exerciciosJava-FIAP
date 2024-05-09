package banco.exceptions;

public class SaqueInvalidoException extends RuntimeException{
    public SaqueInvalidoException(String message) {
        super(message);
    }
}
