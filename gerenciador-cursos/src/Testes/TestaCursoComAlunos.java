package Testes;

import Classes.Aluno;
import Classes.Aula;
import Classes.Curso;

public class TestaCursoComAlunos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		javaColecoes.matricula(new Aluno("Melissa Junqueira", 201920483));
		javaColecoes.matricula(new Aluno("Bernardo Junqueira", 202020483));
		javaColecoes.matricula(new Aluno("Juliana Junqueira", 197220483));
		javaColecoes.matricula(new Aluno("David Lins", 197720483));
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
	}
}
