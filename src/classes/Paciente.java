package classes;

public class Paciente {
	private String nome;
	private int idade;
	
	public Paciente(String nome, int idade) {
		if (idade<0 || idade>150)
			throw new RuntimeException("Impossível adicionar paciente "+nome+": idade inválida");
		else {
			this.nome=nome;
			this.idade=idade;
		}
	}
	
	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getIdade() {
		return idade;
	}

	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return ("Nome: "+nome+" || Idade: "+idade+"\n");
	}

	

}
