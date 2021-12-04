package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
	}
	
	@Test
	void naoDeveriaLancarExcecaoAoCriarUmEmailValido() {
		assertDoesNotThrow(() -> new Email("fulano@gmail.com"));
		assertDoesNotThrow(() -> new Email("fulano@yahoo.com.br"));
		assertDoesNotThrow(() -> new Email("fulano.sicrano@email.com.br"));
	}
}
	