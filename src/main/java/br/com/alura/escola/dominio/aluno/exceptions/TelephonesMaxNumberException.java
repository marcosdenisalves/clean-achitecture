package br.com.alura.escola.dominio.aluno.exceptions;

public class TelephonesMaxNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public TelephonesMaxNumberException(String msg) {
		super(msg);
	}
}
