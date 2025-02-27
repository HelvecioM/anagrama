package anagrama;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class AnagramaTest {

	@Test
	public void testGerarAnagramas() {
		String input = "abc";
		Set<String> anagramasGerados = new HashSet<>();
		AnagramaGerador.gerarAnagramas(input, "", anagramasGerados);

		// Verificando que o número de anagramas gerados é 6
		assertEquals(6, anagramasGerados.size());

		// Verificando se todos os anagramas possíveis estão presentes
		assertTrue(anagramasGerados.contains("abc"));
		assertTrue(anagramasGerados.contains("acb"));
		assertTrue(anagramasGerados.contains("bac"));
		assertTrue(anagramasGerados.contains("bca"));
		assertTrue(anagramasGerados.contains("cab"));
		assertTrue(anagramasGerados.contains("cba"));
	}
}