package Testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.shuffle(aulas);
		System.out.println(aulas);
	}
}