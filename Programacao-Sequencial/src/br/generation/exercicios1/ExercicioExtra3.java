package br.generation.exercicios1;

import java.util.Scanner;

public class ExercicioExtra3 {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		 * categoria ela se encontra: 10-14 infantil 15-17 juvenil 18-25 adulto
		 */
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.print("Insira sua idade: ");
		idade = ler.nextInt();
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria � infatil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria � juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria � adulto.");
		} else
			System.out.println("Voc� est� al�m dos meus par�metros de medi��o");
	ler.close();
	}
}
