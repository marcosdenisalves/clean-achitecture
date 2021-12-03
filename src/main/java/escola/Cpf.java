package escola;

public class Cpf {
	
	private String CPF_VALIDATE = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

	private String numero;

	public Cpf(String numero) {

		if (numero == null || !numero.matches(CPF_VALIDATE))
			throw new IllegalArgumentException("CPF invalido!");
		
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}