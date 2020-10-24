package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		byte[] alice = {65, 108, 105, 99, 101};
		fos.write(alice);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(" Olá mundo");
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.newLine();
		bw.write("Curso de Java da Alura");

		bw.close();
	}

}
