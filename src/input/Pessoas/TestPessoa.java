package input.Pessoas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class TestPessoa {
	public static void main(String[] args) throws IOException {
		Objetos ob = new Objetos();
		Pessoa g1 = new Gerente("renato", 5),
				f1 = new Funcionarios("Joao", 2, 5);
		
		ob.inserir(g1);
		ob.inserir(f1);
		
		Scanner sc = new Scanner(System.in);
		File f = new File("dependentes1.txt");
		if(f.exists()) {
			ob.carregar2(new Scanner(f));
		}
		
		ob.verificacao(sc);
		
		
		//PrintStream ps = new PrintStream("dependentes1.txt");
		//ob.salvar(ps);
		
		ob.exibir();
		
		
	}
}
