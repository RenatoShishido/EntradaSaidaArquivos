package input.Pessoas;

import java.io.PrintStream;

public class Funcionarios extends Pessoa {
	private int correlacao;

	public Funcionarios(String nome, int id, int correlacao) {
		super(nome, id);
		this.correlacao = correlacao;
	}

	public int getCorrelacao() {
		return correlacao;
	}

	public void setCorrelacao(int correlacao) {
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
