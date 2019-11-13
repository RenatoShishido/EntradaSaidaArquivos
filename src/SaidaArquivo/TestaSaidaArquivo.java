package SaidaArquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaSaidaArquivo {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("EntradaSaidaArquivoISO1");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("EntradaSaidaArquivoISO1"), "UTF-8"));
		
		
		bw.write("aá");
	}
}
