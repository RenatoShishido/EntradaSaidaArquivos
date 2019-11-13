package Banco;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestBanco {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BancoGerencia gerencia = new BancoGerencia();
		AcaoCobraCesta acao = new AcaoCobraCesta();
		
		Conta p1 = new Poupanca(2777, "Renato", 1500, 0.15);
		
		Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
		
		p1.salvar(ps);
		
		gerencia.exibir();
		
		
		
		
		
		
		
		
		/*int opcao;
		System.out.println("*****************************************");
		System.out.println("***1 - Adicionar Conta Corrente***");
		System.out.println("***2 - Adicionar Conta Poupanca***");
		System.out.println("***3 - Remover Conta por Nome***");
		System.out.println("***4 - Remover Conta por Numero***");
		System.out.println("***5 - Ordenar Conta por Nome***");
		System.out.println("***6 - Ordenar Conta por Numero***");
		System.out.println("***7 - Aplicacao Conta***");
		System.out.println("***8 - Exibir conta***");
		System.out.println("***9 - *****************");
		System.out.println("***0 - FINALIZAR PROCESSO***");
		System.out.println("********************");
		System.out.println("********************");
		
		
		do {
			opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			int numero;
			String nomeTitular, i;
			double saldo,limite,taxaJuros;
			
			System.out.println("Digite o numero da conta");
			numero = sc.nextInt();
			System.out.println("Digite o saldo");
			saldo = sc.nextDouble();
			System.out.println("Digite o limite");
			limite = sc.nextDouble();
			System.out.println("Digite a taxaJuros");
			taxaJuros = sc.nextDouble();
			System.out.println("Digite o nome do Titular");
			nomeTitular = sc.nextLine();
			
			Conta c1 = new Corrente(numero,nomeTitular,saldo,limite,taxaJuros);
			gerencia.inserir(c1);
			break;
		case 2:
			System.out.println("Digite o numero da conta");
			numero = sc.nextInt();
			System.out.println("Digite o saldo");
			saldo = sc.nextDouble();
			System.out.println("Digite o limite");
			limite = sc.nextDouble();
			System.out.println("Digite o nome do Titular");
			nomeTitular = sc.nextLine();
			
			Conta p1 = new Poupanca(numero,nomeTitular,saldo,limite);
			gerencia.inserir(p1);
			break;
		case 3:
			boolean correto = true;
			System.out.println("Digite o Nome do Usuario que gostaria de remover");
			while(correto) {
				nomeTitular = sc.nextLine();
				if(gerencia.PessoaNome(nomeTitular)) {
					try {
						gerencia.remover(nomeTitular);
						correto = false;
					}catch (ContaNaoEncontradaException ex) {
						ex.printStackTrace();
					}
				}
			}
			break;
		case 4:
			boolean correto1 = true;
			System.out.println("Digite o Numero do Usuario que gostaria de remover");
			while(correto1) {
				int Numero = sc.nextInt();
				if(gerencia.PessoaNumero(Numero)) {
					try {
						gerencia.remover(Numero);
						correto1 = false;
					}catch (ContaNaoEncontradaException ex) {
						ex.printStackTrace();
					}
				}
			}
			break;
		case 5:
			gerencia.ordernarNumero();
			break;
		case 6:
			gerencia.ordernarNome();
			break;
		case 7:
			gerencia.aplicaAcao(acao);
			break;
		case 8:
			gerencia.exibir();
			break;
			
			}
		}while(opcao != 0);*/
		
	}
}
