import java.util.*;
public class NúmerosInvertidos {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int i;
		int a[]= new int [10];
		int b[]= new int [10];
		for(i=0; i<10; i++) {
			System.out.println("Escreva o "+(i+1)+" valor de A");
			a[i]= leia.nextInt();
		}
		
		b[0]= a[9];
		b[1]= a[8];
		b[2]= a[7];
		b[3]= a[6];
		b[4]= a[5];
		b[5]= a[4];
		b[6]= a[3];
		b[7]= a[2];
		b[8]= a[1];
		b[9]= a[0];
		
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
