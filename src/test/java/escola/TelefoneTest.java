package escola;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void deveriaLancarExcecaoAoPassarUmTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("0G4", "98382-5818"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("078", "9838258186954"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("099", "983825818AA54"));
	}
	
	@Test
	void naoDeveriaLancarExcecaoAoPassarUmTelefoneValido() {
		assertDoesNotThrow(() -> new Telefone("24","98382-5818"));
		assertDoesNotThrow(() -> new Telefone("66","97434-6223"));
		assertDoesNotThrow(() -> new Telefone("47","99628-4081"));
	}
}
