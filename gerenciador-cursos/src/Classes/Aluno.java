package Classes;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Preencha o nome do aluno");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}	
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}	
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Aluno other = (Aluno) obj;
//		return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
//	}	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(nome, numeroMatricula);
//	}
}
