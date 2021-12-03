package escola;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CpfTest {

	@Test
	void deveriaLancarExcecaoAoPassarCPFInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf("938.3A4.8BB-78"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("AAC.G74.890-7Y"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("938-374-890-78"));
	}
	
	@Test
	void naoDeveriaLancarExcecaoAoPassarCPFValido() {
		assertDoesNotThrow(() -> new Cpf("938.374.890-78"));
		assertDoesNotThrow(() -> new Cpf("108.353.040-27"));
		assertDoesNotThrow(() -> new Cpf("156.591.894-07"));
	}
}
