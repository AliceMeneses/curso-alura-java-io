package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		int conteudo; 		
		FileInputStream fis = new FileInputStream("lorem.txt");
		
		FileOutputStream fos = new FileOutputStream("lorem3.txt");
		conteudo = fis.read();
		while(conteudo != -1) {
			fos.write(conteudo);
			conteudo = fis.read();
		}
		fis.close();
		fos.close();
		
	}

}
