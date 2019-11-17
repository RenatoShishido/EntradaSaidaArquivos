package EntradaArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaArquivo {
	public static void main(String[] args) throws IOException {
		FileInputStream UTF = new FileInputStream("EntradaSaidaArquivoUTF-8");
		FileInputStream ISO = new FileInputStream("EntradaSaidaArquivoISO");
		
		System.out.println("EntradaSaidaArquivoUTF-8");
		int a = UTF.read();
		
		while (a != -1) {
		 System.out.println(a);
			a = UTF.read();
		}
		
		System.out.println("EntradaSaidaArquivoISO");
		int c = ISO.read();
		
		while (c != -1) {
			System.out.println(c);
			c = ISO.read();
		}

	}
}
