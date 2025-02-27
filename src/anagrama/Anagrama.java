package anagrama;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrama {

	public static void main(String[] args) {

		AnagramaGerador ag = new AnagramaGerador();

		Scanner lt = new Scanner(System.in);
		System.out.print("Digite uma sequencia de caracteres sem espaços e aperte enter: ");
		String palavra = lt.nextLine();
		ag.testeCaracteres(palavra);
		
		String sequencia = palavra;
		char[] input = sequencia.toCharArray();

		Set<String> anagramas = new HashSet<>();
		ag.gerarAnagramas(palavra, "", anagramas);

		System.out.println("Anagramas possíveis:");
		for (String anagrama : anagramas) {
			System.out.println(anagrama);
		}
	}
}
