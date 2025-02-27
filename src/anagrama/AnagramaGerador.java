package anagrama;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AnagramaGerador {

	
	public void testeCaracteres(String palavra) {
		
		if (palavra == null || palavra.trim().isEmpty()) {
			System.out.println("Entrada inválida. Por favor, digite uma palavra válida.");
			return;
		}

		if (palavra.contains(" ")) {
			System.out.println("Entrada inválida. Por favor, digite uma palavra sem espaços.");
			return;
		}

		boolean isValid = palavra.matches("^(?=.*[a-zA-Z])(?=.*\\d).*$");

		if (isValid) {
			System.out.println("Favor digitar somente letras e sem espaços");
			return;
		} else {
			System.out.println("Dados validados - Processando");
		}
	}
	
	/**
	 * Gera todos os anagramas possíveis a partir de um conjunto de letras
	 * distintas.
	 *
	 * @param letters Um array de caracteres distintos.
	 * @return Uma lista contendo todos os anagramas gerados.
	 */

	public static void gerarAnagramas(String str, String anagrama, Set<String> anagramasGerados) {

		if (str.length() == 0) {
			anagramasGerados.add(anagrama);
		} else {
			for (int i = 0; i < str.length(); i++) {
				// Evitar anagramas duplicados
				if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
					continue;
				}
				// Recursão com a letra corrente removida
				gerarAnagramas(str.substring(0, i) + str.substring(i + 1), anagrama + str.charAt(i), anagramasGerados);
			}
		}
	}
	
}
