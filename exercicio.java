package com.estruturadados.pilha;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		try (Scanner scan = new Scanner(System.in)) {
			for (int i=1; i<=30; i++){
				
				System.out.println("Entre com um numero: ");

				int num = scan.nextInt();

				if (num == 0){

					Integer desempilhado = par.desempilha();

					if (desempilhado == null){
						System.out.println("Pilha par vazia");
					} else {
						System.out.println("Desempilhando da pilha par: " + desempilhado);
					}

					desempilhado = impar.desempilha();

					if (desempilhado == null){
						System.out.println("Pilha impar vazia");
					} else {
						System.out.println("Desempilhando da pilha impar: " + desempilhado);
					}


				} else if (num % 2 == 0){
					System.out.println("Numero par, empilhando na pilha par: " + num);
					par.empilha(num);
				} else {
					System.out.println("Numero impar, empilhando na pilha impar: " + num);
					impar.empilha(num);
				}
			}
		}

		System.out.println("Desempilhando todos os numeros da pilhar par");

		while (!par.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}

		System.out.println("Desempilhando todos os numeros da pilhar impar");

		while (!impar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
		}

	}

}
