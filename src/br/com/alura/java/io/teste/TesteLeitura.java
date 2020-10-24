package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("lorem.txt");
		//System.out.println("Correspondente decimal ao primeiro caracter do arquivo" + fis.read()); 
		InputStreamReader isr = new InputStreamReader(fis);
		//char[] letra = new char[452];
		//System.out.println("Quantidade de caracteres no arquivo: " + isr.read(letra));
		//System.out.println("Primeiro caracter do arquivo: " + letra[0]);
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println("Conteudo do arquivo:");
		System.out.println();
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
