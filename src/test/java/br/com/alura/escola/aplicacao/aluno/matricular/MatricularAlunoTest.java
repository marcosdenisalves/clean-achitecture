package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.AlunoDTO;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
		
		AlunoDTO dto = new AlunoDTO("Fulano", "123.456.789-00", "fulano@email.com");
		useCase.executa(dto);
		
		Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}
}
