package Banco;

import java.io.IOException;
import java.io.PrintStream;

public abstract class Conta {
	protected int numero;
	protected String nomeTitular;
	protected double saldo;

	public Conta(int numero, String nomeTitular, double saldo) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void saca(double valor);

	public abstract void deposita(double valor);

	public abstract void fimDoMes();

	public abstract void salvar(PrintStream ps) throws IOException;

	@Override
	public String toString() {
		return "Banco [numero=" + numero + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

}
