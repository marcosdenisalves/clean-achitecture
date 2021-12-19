package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.exceptions.TelephonesMaxNumberException;

class AlunoTest {
	
	private Aluno aluno;

	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno();
	}
	
	@AfterEach
	void afterEach() {
		this.aluno.getTelefones().clear();
	}

	@Test
	void deveLancarExcecaoQuandoAtingirONumeroMaximoDeTelefones() {
		assertThrows(TelephonesMaxNumberException.class, () -> {
			for (int i = 0; i <= 3; i++) 
				aluno.adicionarTelefone("83", "3571-348" + i);
			});
	}
	
	@Test
	void deveriaPerimitirAdicionarDoisTelefones() {
		assertThrows(TelephonesMaxNumberException.class, () -> {
			for (int i = 0; i <= 2; i++) 
				this.aluno.adicionarTelefone("83", "3571-348" + i);
			});
	}
}
