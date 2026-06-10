package fundamentos;

public class Aula04_Inferencia {

	public static void main(String[] args) {

		double a = 4.5; // variável declarada e determinada o valor
		System.out.println(a);

		var b = 4.5; // var faz a inferencia do valor e determina o tipo da variável (resultado =
						// double)
		System.out.println(b);

		var c = "Texto"; // determina que é do tipo (string)
		System.out.println(c);

		c = "Outro texto"; // determina que é do tipo (string)
		System.out.println(c);

		// Posso reatribuir o valor da variavel para o mesmo tipo, não posso mudar par
		// outro como numeros onde era string

		double d; // variável foi declarada
		d = 123.65; // foi definido o valor
		System.out.println(d);

		// Não é possível com var, declarar a variável em uma linha e definir valor na
		// outra.

		// Um detalhe: com var, não é possível reatribuir um valor decimal quando ela ja
		// definiu que é um valor inteiro.

		var f = 12; // Aqui ela já definiu que é do tipo INTEIRO.
		//f = 12.01; // o resultado é um erro: cannot convert from double to int

		System.out.println(f); // erro: cannot convert from double to int
	}

}
