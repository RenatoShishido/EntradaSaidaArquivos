package input.Pessoas;

import java.io.PrintStream;

public class Funcionarios extends Pessoa {
	private long correlacao;

	public Funcionarios(String nome, long id, long correlacao) {
		super(nome, id);
		this.correlacao = correlacao;
	}

	public long getCorrelacao() {
		return correlacao;
	}

	public void setCorrelacao(long correlacao) {
		this.correlacao = correlacao;
	}

	public void salvar(PrintStream ps) {
		ps.println("Funcionarios");
		ps.println(getNome() + " " + getId() + " " + correlacao);
	}
	

	@Override
	public String toString() {
		return "Funcionarios [nome=" + super.getNome() + ", id=" + super.getId() + ", correlacao=" + correlacao + "]";
	}

}
