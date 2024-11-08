import java.util.*;
public class Soma {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int i;
		int a[]= new int[10];
		int b[]= new int[10];
		int c[]= new int[10];
		for(i=0;i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A");
			a[i]=leia.nextInt();
		}
		for(i=0;i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de B");
			b[i]=leia.nextInt();
			c[i]= a[i]+b[i];
		}
		System.out.print("A=[");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("]\n");
		
		System.out.print("B=[");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.println("]\n");
		System.out.print("C=[");
		for(i=0; i<10; i++) {
			System.out.print(c[i]+ " ");
		}leia.close();
		System.out.println("]\n");
	}
}
