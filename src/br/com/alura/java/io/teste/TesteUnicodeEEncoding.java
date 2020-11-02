package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Charset charset = Charset.defaultCharset();
		System.out.println("Encoding padrão: " + charset);
		
		System.out.println("-------------------------------------------");
		
		String letra = "a";		
		System.out.println("Code Point: " + letra.codePointAt(0) + " Letra: " + letra);
		
		byte[] bytes = letra.getBytes();
		String outraLetra = new String(bytes);
		System.out.println("Encoding: windows-1252, Tamanho: " + bytes.length + ", Resultado: " + outraLetra );
		
		bytes = letra.getBytes("US-ASCII");
		outraLetra = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println("Encoding: US-ASCII, Tamanho: " + bytes.length + ", Resultado: " + outraLetra );
		
		bytes = letra.getBytes("UTF-16");
		outraLetra = new String(bytes, StandardCharsets.UTF_16);
		System.out.println("Encoding: UTF-16, Tamanho: " + bytes.length + ", Resultado: " + outraLetra );
		 
		System.out.println("-------------------------------------------");
		
		System.out.println("Utilizei o encoding errado");
		bytes = letra.getBytes("UTF-16");
		outraLetra = new String(bytes);// windows-1252
		System.out.println("Letra esperada: a, Resultado: " + outraLetra);
		
		
	}

}
