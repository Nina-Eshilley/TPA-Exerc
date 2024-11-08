import java.util.*;
public class Sucessor {
	public static void main(String srgs[]) {
		Scanner leia = new Scanner (System.in);
		int n, sucessor, antecessor;
		System.out.println("Escreva o número inteiro");
		n= leia.nextInt();
		antecessor= n-1;
		sucessor= n+1;
		System.out.println("O sucessor do número é: " +sucessor);
		System.out.println("O antecessor do número é: "+antecessor);
	}leia.close();

}
