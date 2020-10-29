package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("lorem8.txt");
		
		ps.println("Ol� mundo");
		ps.println();
		ps.println("Curso de Java da Alura");

		ps.close();
		
		PrintStream console = System.out;
		console.println("Ol� mundo");
		console.close();
	}

}
