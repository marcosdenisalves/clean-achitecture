package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.exceptions.TelephonesMaxNumberException;

//AGGREATE ROOT
public class Aluno {

	private Cpf cpf;
	private String nome;
	private Email email;
	private String senha;
	
	private List<Telefone> telefones = new ArrayList<>();

	public Aluno() {}
	
	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if (this.telefones.size() == 2) {
			throw new TelephonesMaxNumberException("Este aluno já atingiu o número máximo de telefones");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}