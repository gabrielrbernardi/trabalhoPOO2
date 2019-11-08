package trabalho2POO_2;
public class LimiteException extends RuntimeException{							// classe para tratamento de excecao, no caso se o limite especial das contas correntes especiais ficar menor que 0
	private static final long serialVersionUID = 1L;
	
	public LimiteException(String msg) {
		super(msg);
	}
}

