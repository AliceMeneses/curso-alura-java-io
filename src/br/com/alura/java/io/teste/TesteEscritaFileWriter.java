package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("lorem6.txt");
		
		fw.write("Olá mundo");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("Curso de Java da Alura");

		fw.close();
	}

}
