import java.util.*;
public class Tabuada {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int numero, i = 0, r;
			System.out.println("Digite um número para ver a sua tabuada");
			numero= leia.nextInt();
			System.out.println("A tabuada do número " +numero+ " é: ");
			while (i <10) {
				i++;
				r=numero*i;
				System.out.println(numero+ " x " + i + " = " + r);
			}leia.close();
		}

}
