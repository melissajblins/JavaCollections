package Testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Classes.Aula;

public class TestandoListAulas {

	public static void main(String[] args) {
		Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 15);
		Aula aula3 = new Aula("Relacionamento de Listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
//		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
