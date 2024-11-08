import java.util.*;
public class Média {
	public static void main (String args[]) {
		Scanner leia= new Scanner (System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Digite a primeira nota:");
		nota1= leia.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2= leia.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota3= leia.nextDouble();
		media= (nota1+nota2+nota3)/3;
		System.out.println("Sua média é: "+ media);
	}leia.close();

}
