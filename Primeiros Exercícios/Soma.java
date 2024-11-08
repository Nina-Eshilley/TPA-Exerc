import java.util.*;
public class Soma {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		int valor1, valor2, valor3, soma;
		System.out.println ("Digite o primeiro valor");
		valor1 = leia.nextInt();
		System.out.println ("Digite o segundo valor");
		valor2 = leia.nextInt();
		System.out.println ("Digite o terceiro valor");
		valor3 = leia.nextInt();
		soma = valor1*valor1+(valor2*valor2)+(valor3*valor3);
		System.out.println ("A soma do quadrado dos três valores é igual a: " +soma);
	}leia.close();

}
