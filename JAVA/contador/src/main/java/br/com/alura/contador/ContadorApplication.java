package br.com.alura.contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SpringApplication.run(ContadorApplication.class, args);
		System.out.print("Digite um numero: ");

		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println( i + " ");
		}
		sc.close();
	}
	@Override
	public void run(String... args) throws Exception {

	}
}
