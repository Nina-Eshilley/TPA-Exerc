import java.util.*;
public class Média {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int i, soma=0;
		double media;
		int a[]= new int [10];
		for(i=0; i<10; i++) {
		System.out.println("Escreva o "+(i+1)+" valor de A");
		a[i]= leia.nextInt();
		soma= a[i]+soma;
		}
		
		media=soma/10;
		
		System.out.print("A=[");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}leia.close();
		System.out.print("]\n");
		System.out.println("A média é de: " +media);
	}

}
