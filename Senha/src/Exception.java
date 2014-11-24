import java.util.regex.Pattern;


public class Exception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public Exception(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public Exception(String mensagem) {
		super(mensagem);
	}
}