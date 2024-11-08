import java.util.*;
public class Fatorial {
		public static void main(String[] args) {
			Scanner leia =new Scanner(System.in);
			int n, f=1, i=0; 
			System.out.println("Escreva um número e descubra o seu fatorial");
			n=leia.nextInt();
			while(i<n) { //enquanto i for menor que o número 
				i++; // vamos adicionar mais 1 ao i
				f=f*i; //e multiplicar o f pelo i. Armazenando o valor em f, que vai se repetir 
				//enquanto o i for menor que n 
			}leia.close();
			System.out.println("O fatorial de "+n+" é " +f);
		}

}
