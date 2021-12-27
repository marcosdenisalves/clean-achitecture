package br.com.alura.escola.academico.infra.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Cpf;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) {
		Optional<Aluno> opt = this.matriculados.stream()
				.filter(x -> x.getCpf().equalsIgnoreCase(cpf.getNumero()))
				.findFirst();

		return opt.isPresent() ? opt.get() : null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}
}
