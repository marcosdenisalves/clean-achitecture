package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private Cpf cpf;
	private String nome;

	private Email email;

	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	private List<Telefone> telefones = new ArrayList<>();

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno(null, null, null);
		
	}
}
