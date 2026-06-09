package fundamentos;

public class Aula02_Variaveis_Constantes {

    public static void main(String[] args) {

        int numeroInteiro = 3; // Armazena números inteiros.

        // Área de uma circunferência

        double raio = 3.4; // Raio do círculo.

        final double PI = 3.14159; // Constante PI.

        double area = PI * raio * raio; // Área = PI × raio²

        System.out.println("Área = " + area + " m²");

        raio = 10;

        area = PI * raio * raio;

        System.out.println("Área = " + area + " m²");
    }
}
