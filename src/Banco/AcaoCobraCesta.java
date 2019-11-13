package Banco;

public class AcaoCobraCesta implements AcaoConta {
	private double valorCobrado;

	public AcaoCobraCesta() {

	}

	public AcaoCobraCesta(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public void aplica(Conta c) {
		c.saldo -= valorCobrado;
	}
}
