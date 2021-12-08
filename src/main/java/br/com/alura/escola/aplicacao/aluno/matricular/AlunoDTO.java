package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.Email;

public class AlunoDTO {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public AlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}
	
	public Aluno criarAluno() {
		return new Aluno(new Cpf(this.cpfAluno), 
				this.nomeAluno, new Email(this.emailAluno));
	}
}
