package br.com.sarahbrito.calculadora.baseCalculadora;

/**
 * Calculadora
 *
 * Calculadora que realiza as operacoes basicas matematicas (soma, subtracao,
 * multiplicacao e divisao).
 *
 * @author Sarah Neuburger Brito
 */

import java.util.Scanner;

public class Calculadora {

	private double resultado;
	private static double valor1;
	private static double valor2;
	private static int operacao;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Informe uma opção para cálculo: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
		try {
			operacao = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Informe os dois valores para executar a operação solicitada:");
		valor1 = scanner.nextDouble();
		valor2 = scanner.nextDouble();
		Calculadora calc = new Calculadora();
		calc.calcularValores(valor1, valor2);

	}

	/**
	 * Metodo calcular valores.
	 * 
	 * Realiza a operacao e o calculo conforme informacoes fornecidas pelo usuario.
	 * 
	 * @param valor1 Primero valor que sera utilizado no calculo.
	 * @param valor2 Segundo valor que sera utilziado na calculo.
	 * @return o resulto do calculo.
	 */
	public double calcularValores(double valor1, double valor2) {
		switch (operacao) {
		case 1:
			resultado = valor1 + valor2;
			System.out.println("O resultado da sua adição é " + resultado);
			break;

		case 2:
			resultado = valor1 - valor2;
			System.out.println("O resultado da sua subtração é " + resultado);
			break;

		case 3:
			resultado = valor1 * valor2;
			System.out.println("O resultado da sua multiplicação é " + resultado);
			break;

		case 4:
			if (valor2 == 0) {
				System.out.println("Não é possível dividir por zero");
			} else {
				resultado = valor1 / valor2;
				System.out.println("O resultado da sua divisão é " + resultado);
			}
			break;

		default:
			System.out.println("Selecione uma opção válida.");

		}

		return resultado;
	}
}
