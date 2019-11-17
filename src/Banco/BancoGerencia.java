package Banco;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class BancoGerencia {
	private ArrayList<Conta> contas;

	public BancoGerencia() {
		contas = new ArrayList<>();
	}

	public void inserir(Conta c1) {
		contas.add(c1);
	}

	public void remover(int numero) throws ContaNaoEncontradaException {
		Iterator<Conta> it = contas.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.numero == numero) {
				it.remove();
			} else
				throw new ContaNaoEncontradaException("Numero de Usuario nao encontrado: " + numero);
		}
	}

	public void remover(String nome) throws ContaNaoEncontradaException {
		Iterator<Conta> it = contas.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getNomeTitular().equalsIgnoreCase(nome)) {
				it.remove();
			} else
				throw new ContaNaoEncontradaException("Nome de Usuario nao encontrado" + nome);
		}
	}

	public void ordernarNumero() {
		contas.sort(new Comparator<Conta>() {
			public int compare(Conta c1, Conta c2) {
				if (c1.getNumero() < c2.getNumero()) {
					return -1;
				} else if (c1.getNumero() > c2.getNumero())
					return 1;
				else
					return 0;
			}
		});
	}

	public void ordernarNome() {
		contas.sort(new Comparator<Conta>() {
			public int compare(Conta c1, Conta c2) {
				return c1.getNomeTitular().compareTo(c2.getNomeTitular());
			}
		});
	}

	public void exibir() {
		Iterator<Conta> it = contas.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			System.out.println(c1);
		}
	}

	public void aplicaAcao(AcaoConta acao) {
		for (int i = 0; i < contas.size(); i++) {
			acao.aplica(contas.get(i));
		}
	}

	public boolean PessoaNome(String nome) {
		Iterator<Conta> it = contas.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getNomeTitular().equalsIgnoreCase(nome)) {
				return true;
			}
		}
		return false;
	}

	public boolean PessoaNumero(int Numero) {
		Iterator<Conta> it = contas.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getNumero() == Numero) {
				return true;
			}
		}
		return false;
	}

	public void salvar(PrintStream ps) throws IOException {
		for (Conta conta : contas) {
			conta.salvar(ps);
		}
	}
	public void carregar2(Scanner sc) throws FormatoIncorretoException{
		while(sc.hasNext()) {
			inserir(carregar(sc));
		}
	}
	
	public Conta carregar(Scanner sc) throws FormatoIncorretoException {
		String tipo = sc.nextLine();
		int numero = Integer.parseInt(sc.nextLine());
		String nome = sc.nextLine(); 
		double saldo = Double.parseDouble(sc.nextLine());
		if(tipo.equalsIgnoreCase("CONTA POUPANCA")) {
			double taxaRendimento = Double.parseDouble(sc.nextLine());
			
			Conta cp = new Poupanca(numero,nome,saldo,taxaRendimento);
			
			return cp;
		}else if(tipo.equalsIgnoreCase("CONTA CORRENTE")) {
			double limite = Double.parseDouble(sc.nextLine());
			double taxaJuros = Double.parseDouble(sc.nextLine());
			
			Conta cc = new Corrente(numero,nome,saldo,limite,taxaJuros);
			
			return cc;
		}else
			throw new FormatoIncorretoException("Nao foi possivel carregar suas conta do BDDados");
	}
}
