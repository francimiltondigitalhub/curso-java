package fundamentos;

public class Aula02_Variaveis_Constantes {

	public static void main(String[] args) {

		int numeroInteiro = 3; // variável DO TIPO INTEIRO --> Usado para números inteiros (sem casas
								// decimais).

		// Área de uma circunferência:

		double Raio = 3.4; // Variável para armazenar o raio do círculo.

		final double PI = 3.14159; // Valor de PI. Como não muda, pode ser transformado em constante (final)

		double Area = PI * Raio * Raio; // Fórmula da área: π × raio²

		System.out.println(Area);

		Raio = 10;
		Area = PI * Raio * Raio;
		System.out.println("Área = " + Area + "m2"); // concatena
	}
}
