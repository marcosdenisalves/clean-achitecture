package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.AlunoDTO;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Main {
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@gmail.com";
		
		MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricularAluno.executa(new AlunoDTO(nome, cpf, email));
	}
}
