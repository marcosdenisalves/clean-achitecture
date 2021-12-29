package br.com.alura.escola.shared.dominio;

public class CPF {
	
	private String CPF_VALIDATE = 
			"\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

	private String numero;

	public CPF(String numero) {

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

	@Override
	public String toString() {
		return numero;
	}
}