package escola;

public class Email {
	
	/*
	 * VALUE OBJECT
	 */

	public static String VALIDATE_EMAIL = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || 
				!endereco.matches(VALIDATE_EMAIL)) {
			throw new IllegalArgumentException("E-mail inválido...");
		}
		this.endereco = endereco;
	}
}
