package br.com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.dominio.Evento;

public class LogDeAlunoMatriculado extends Ouvinte {

	@Override
	public void reageAo(Evento evento) {
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(String.format("Aluno com CPF %s matriculado em: %s",
				((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}
}
