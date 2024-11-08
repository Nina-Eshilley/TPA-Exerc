import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, i=0, a=0, b=1, c;
		System.out.println("Escreva quantas vezes quer que a sequência de Fibonacci se repita");
		n=leia.nextInt();
		while(i<n) {
			c= a+b; // o atual agora vale 1
			a=b; // anterior vale o b. Anterior = 1
			b=c; // b recebe o valor atual. Atual = 1
			i++;
			
			// No fim o a vai ser somado com o b novamente, dando o resultado 2
			System.out.println(c);
		}leia.close();
			
		}

}
