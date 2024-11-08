import java.util.*;
public class Quadrado {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int i;
		int a[]= new int [10];
		int b[]= new int [10];
		
		for(i=0; i<10; i++) {
			System.out.println("Entre com o " +(i+1)+ " valor de A");
			a[i]=leia.nextInt();
			b[i]= a[i]*a[i];
		}
		System.out.print("A=[");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("]\n");
		
		System.out.print("B=[");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+ " ");
		}leia.close();
		System.out.println("]\n");
	}

}
