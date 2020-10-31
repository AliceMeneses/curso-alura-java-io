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
			System.out.println(linha);
			
			Scanner scannerLinha = new Scanner(linha);
			scannerLinha.useDelimiter(",");
			scannerLinha.useLocale(Locale.US);
			
			String conta = scannerLinha.next();
			int agencia = scannerLinha.nextInt();
			int numero = scannerLinha.nextInt();
			String titular = scannerLinha.next();
			double saldo = scannerLinha.nextDouble();
			
			System.out.println("Tipo de conta: " + conta);
			System.out.println("Número da conta: " + numero);
			System.out.println("Agencia: " + agencia);
			System.out.println("Titular: " + titular);
			System.out.println("Saldo: R$" + saldo);
			System.out.println("----------------------");
			
			scannerLinha.close();
		}
		scanner.close();
	}

}
