package p3E01;

import java.util.Scanner;

public class P3E01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de pessoas: ");
		int numPessoas = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[numPessoas];

		for (int i = 0; i < numPessoas; i++) {
					
			System.out.print("Id: ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Altura: ");
			Double altura = sc.nextDouble();
			
			Pessoa pessoa = new Pessoa(id, nome, altura);
			
			pessoas[i]=pessoa;
		}
		
		System.out.println("A média das alturas é: " + Pessoa.mediaAltura(pessoas));

	}

}
