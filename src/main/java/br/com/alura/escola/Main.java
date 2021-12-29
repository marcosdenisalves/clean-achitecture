package br.com.alura.escola;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.AlunoDTO;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

public class Main {
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@gmail.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricularAluno.executa(new AlunoDTO(nome, cpf, email));
	}
}
