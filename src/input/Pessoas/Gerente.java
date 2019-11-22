package input.Pessoas;

import java.io.PrintStream;

public class Gerente extends Pessoa{

	public Gerente(String nome, int id) {
		super(nome, id);
	}
	
	public void salvar(PrintStream ps) {
		ps.println("Gerentes");
		ps.println(getNome() +  " " + getId());
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + super.getNome() + ", id=" + super.getId() + "]";
	}


	
	
}
