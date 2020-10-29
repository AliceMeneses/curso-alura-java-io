package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("lorem9.txt");
		
		pw.println("Olá mundo");
		pw.println();
		pw.println("Curso de Java da Alura");

		pw.close();
	}

}
