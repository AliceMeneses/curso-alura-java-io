package br.com.alura.java.io.teste;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiaArquivo4 {

	public static void main(String[] args) throws IOException{
		InputStream fis = System.in;//entrada pelo teclado
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;//saida pelo console
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String conteudo = br.readLine();
		while(!conteudo.isEmpty()) {
			bw.write(conteudo);
			bw.newLine();
			bw.flush();
			conteudo = br.readLine();
		}
		
		bw.close();
		br.close();
		
	}

}

