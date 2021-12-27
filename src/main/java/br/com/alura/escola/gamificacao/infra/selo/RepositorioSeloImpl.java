package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.academico.dominio.aluno.Cpf;
import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

public class RepositorioSeloImpl implements RepositorioDeSelo {

	List<Selo> selos = new ArrayList<Selo>();

	@Override
	public void adicionar(Selo selo) {
		selos.add(selo);
	}

	@Override
	public List<Selo> selosDoAlunoPorCpf(Cpf cpf) {
		return this.selos
				.stream()
				.filter(x -> x.getCpfDoAluno().equals(cpf))
				.collect(Collectors.toList());
	}
}
