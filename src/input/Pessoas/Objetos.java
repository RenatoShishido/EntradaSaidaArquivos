package input.Pessoas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Objetos {
	private ArrayList<Pessoa> pessoa;

	public Objetos() {
		pessoa = new ArrayList<Pessoa>();
	}

	public void inserir(Pessoa p1) {
		pessoa.add(p1);
	}

	public void remover(String nome) throws nomeInvalidoException {
		Iterator<Pessoa> it = pessoa.iterator();
		while (it.hasNext()) {
			Pessoa p1 = it.next();
			if (p1.getNome().equalsIgnoreCase(nome)) {
				it.remove();
			} else
				throw new nomeInvalidoException("Nome invalido");
		}
	}

	public void carregar2(Scanner sc) {
		while (sc.hasNext()) {
			inserir(carregar(sc));
		}
	}

	public Pessoa carregar(Scanner sc) {
		String array[] = new String[5];
		String tipo = sc.nextLine();
		String leitura = sc.nextLine();

		array = leitura.split(" ");
		if (tipo.equalsIgnoreCase("Gerentes")) {
			String nome = array[0];
			int id = Integer.parseInt(array[1]);
			Pessoa p1 = new Gerente(nome, id);
			return p1;
		} else {
			String nome = array[0];
			int id = Integer.parseInt(array[1]);
			int colecao = Integer.parseInt(array[2]);
			Pessoa f1 = new Funcionarios(nome, id, colecao);
			return f1;
		}
	}

	public void verificacao(Scanner sc) throws FileNotFoundException {
		File f = new File("final.txt");
		PrintStream ps = new PrintStream("final.txt");
		for (int i = 0; i < pessoa.size(); i++) {
			for (int j = i + 1; j < pessoa.size(); j++) {
				if (pessoa.get(i).getId() == pessoa.get(j).getId()) {
					ps.println("###########################");
					ps.println(pessoa.get(i).getNome() + " >>>>>> " + pessoa.get(j).getNome());
				}
			}
		}
	}

	public void salvar(PrintStream ps) {
		for (Pessoa pessoa2 : pessoa) {
			pessoa2.salvar(ps);
		}
	}

	public void exibir() {
		for (Pessoa pessoa2 : pessoa) {
			System.out.println(pessoa2);
		}
	}

}
