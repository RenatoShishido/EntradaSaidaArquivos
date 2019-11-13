package EntradaArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaArquivo {
	public static void main(String [] args) throws IOException {
		InputStream UTF = new FileInputStream("EntradaSaidaArquivoUTF-8");
		InputStream ISO = new FileInputStream("EntradaSaidaArquivoISO");
		
		int a = UTF.read();
		int c = ISO.read();
		
		System.out.println(a);
		System.out.println(c);
		
	
		
		

	}
}
