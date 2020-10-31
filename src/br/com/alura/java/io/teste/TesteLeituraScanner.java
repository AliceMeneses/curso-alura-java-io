package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();		
			
			Scanner scannerLinha = new Scanner(linha);
			scannerLinha.useDelimiter(",");
			scannerLinha.useLocale(Locale.US);
			
			String tipoConta = scannerLinha.next();
			int agencia = scannerLinha.nextInt();
			int numero = scannerLinha.nextInt();
			String titular = scannerLinha.next();
			double saldo = scannerLinha.nextDouble();
			
			
			System.out.format(new Locale("pt","BR"), "%s: %04d-%04d, %s - R$%.2f %n", tipoConta, agencia, numero, titular, saldo);
			System.out.println("----------------------------------------");
			
			scannerLinha.close();
		}
		scanner.close();
	}

}
