package Banco;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Poupanca extends Conta {
	private double taxaRendimento;
	
	
	public Poupanca(int numero, String nomeTitular, double saldo, double taxaRendimento) {
		super(numero, nomeTitular, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public void saca(double valor) {
		if (saldo < valor)
			throw new SaldoInsuficienteException("Nao e possivel sacar com saldo negativo: " + saldo);
		else if (valor < 0) {
			throw new IllegalArgumentException("Nao e possivel sacar valor negativo: " + valor);
		} else if (saldo > valor) {
			saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0)
			throw new IllegalArgumentException("ERROR: Depositando um valor negativo " + valor);
		else
			saldo += valor;
	}

	public void fimDoMes() {
		saldo = saldo + (saldo * taxaRendimento);
	}

	public void salvar(PrintStream ps) throws IOException{
		Scanner sc = new Scanner(System.in);
		String arquivo;
		
		System.out.println("Digite o nome do seu arquivo sem espaço o character especial");
		arquivo = sc.next();
		
		ps = new PrintStream(arquivo);

		while (sc.hasNextLine()) {
			ps.println("Poupanca [numero=" + super.numero + ", nomeTitular=" + super.nomeTitular + ", saldo=" + super.saldo + ", taxaRendimento=" +
			taxaRendimento + "]");
		}
	}

	@Override
	public String toString() {
		return "Poupanca [" + super.toString() + ", taxaRendimento=" + taxaRendimento + "]";
	}

}
