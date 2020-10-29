package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem7.txt"));
		
		bw.write("Olá mundo");
		bw.newLine();
		bw.newLine();
		bw.write("Curso de Java da Alura");

		bw.close();
	}

}
