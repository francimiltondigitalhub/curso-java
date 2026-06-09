package fundamentos;

public class Aula03_Desafio_Temperatura {

	public static void main(String[] args) {

		// Desafio: Um programa que recebe uma temperatura em °F e converte para °C
		// Fórmula base: (°F - 32) x 5/9 = °C
		// (Subtrair 32 do °F) e o resultado multiplicar por 5 e dividir por 9
		// 32°F: É o ponto de congelamento da água (0°C)

		// MINHA SOLUÇÃO:
		double tempFahrenheit = 87.5;
		final int PONTO_CONGELAMENTO = 32;

		double tempCelsius = (tempFahrenheit - PONTO_CONGELAMENTO) * 5 / 9.0;

		System.out.println("Temperatura em Celsius: " + tempCelsius + "°C");

		// SOLUÇÃO DO PROFESSOR:
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + " °C.");

		// ÁREA PARA OUTROS TESTES:
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + " °C.");

	}

}
