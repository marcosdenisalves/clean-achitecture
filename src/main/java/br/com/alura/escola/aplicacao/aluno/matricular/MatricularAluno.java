package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

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
				new AlunoMatriculado(new Cpf(aluno.getCpf()));
		
		publicador.publicar(alunoMatriculado);
	}
}
