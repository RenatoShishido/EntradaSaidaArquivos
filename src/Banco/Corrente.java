package Banco;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Corrente extends Conta {
	private double limite;
	private double taxaJuros;

	public Corrente(int numero, String nomeTitular, double saldo, double limite, double taxaJuros) {
		super(numero, nomeTitular, saldo);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void saca(double valor) {
		if (saldo - valor > limite)
			throw new SaldoInsuficienteException("Nao e possivel sacar com saldo negativo: " + saldo);
		else if (valor < 0) {
			throw new IllegalArgumentException("Nao e possivel sacar valor negativo: " + valor);
		} else if (saldo - valor <= limite) {
			saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0)
			throw new IllegalArgumentException("Colocando valor negativo: " + valor);
		else
			saldo += valor;
	}

	public void fimDoMes() {
		saldo = saldo + (saldo * taxaJuros);
	}

	public void salvar(PrintStream ps) throws IOException {
		Scanner sc = new Scanner(System.in);
		String arquivo;
		
		System.out.println("Digite o nome do seu arquivo sem espa�o o character especial");
		arquivo = sc.next();
		
		ps = new PrintStream(arquivo);

		while (sc.hasNextLine()) {
			ps.println("Corrente [numero=" + super.numero + ", nomeTitular=" + super.nomeTitular + ", saldo=" + super.saldo + ", limite=" +
			limite + ", taxaJuros=" + taxaJuros + "]");
		}
	}

	@Override
	public String toString() {
		return "Corrente [" + super.toString() + ", limite=" + limite + ", taxaJuros=" + taxaJuros + "]";
	}

}
