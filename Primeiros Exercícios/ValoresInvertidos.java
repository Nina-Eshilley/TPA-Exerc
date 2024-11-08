import java.util.*;
public class ValoresInvertidos {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int valorA, valorB, c;
		System.out.println("Digite o valor A");
		valorA= leia.nextInt();
		System.out.println("Digite o valor B");
		valorB= leia.nextInt();
		c=valorA;
		valorA= valorB;
		valorB= c;
		System.out.println("O valor A agora é: " +valorA);
		System.out.println("O valor B agora é: " +valorB);
	}leia.close();

}
