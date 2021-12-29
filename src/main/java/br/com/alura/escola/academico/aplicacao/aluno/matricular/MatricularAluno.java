package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}

	public void executa(AlunoDTO alunoDto) {
		Aluno aluno = alunoDto.criarAluno();
		repositorio.matricular(aluno);

		AlunoMatriculado alunoMatriculado = 
				new AlunoMatriculado(new CPF(aluno.getCpf()));
		
		publicador.publicar(alunoMatriculado);
	}
}
