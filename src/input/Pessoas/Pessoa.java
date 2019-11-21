package input.Pessoas;

import java.io.PrintStream;

public abstract class Pessoa {
	private String nome;
	private long id;

	public Pessoa(String nome, long id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public abstract void salvar(PrintStream ps);
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", id=" + id + "]";
	}

}
