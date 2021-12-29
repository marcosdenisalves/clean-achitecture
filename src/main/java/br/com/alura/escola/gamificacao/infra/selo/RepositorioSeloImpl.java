package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;

public class RepositorioSeloImpl implements RepositorioDeSelo {

	List<Selo> selos = new ArrayList<Selo>();

	@Override
	public void adicionar(Selo selo) {
		selos.add(selo);
	}

	@Override
	public List<Selo> selosDoAlunoPorCpf(CPF cpf) {
		return this.selos
				.stream()
				.filter(x -> x.getCpfDoAluno().equals(cpf))
				.collect(Collectors.toList());
	}
}
