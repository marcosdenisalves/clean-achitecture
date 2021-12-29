package br.com.alura.escola.shared.dominio;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void deveriaLancarExcecaoAoPassarCPFInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new CPF("938.3A4.8BB-78"));
		assertThrows(IllegalArgumentException.class, () -> new CPF("AAC.G74.890-7Y"));
		assertThrows(IllegalArgumentException.class, () -> new CPF("938-374-890-78"));
	}
	
	@Test
	void naoDeveriaLancarExcecaoAoPassarCPFValido() {
		assertDoesNotThrow(() -> new CPF("938.374.890-78"));
		assertDoesNotThrow(() -> new CPF("108.353.040-27"));
		assertDoesNotThrow(() -> new CPF("156.591.894-07"));
	}
}
