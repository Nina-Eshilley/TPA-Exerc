import java.util.*;
public class Divisor {
	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int a[], i, j;
		a = new int [10];
		for(i=0; i<10; i++) {
			System.out.println("Escreva o "+(i+1)+"º número do vetor A");
			a[i]=leia.nextInt();
			System.out.println(" ");
		}
		for(i=0; i<10; i++) {
			System.out.println("A = " +a[i]+ " ");
			System.out.print("Divisores de A: [");
			for(j=1; j<=a[i]; j++) {
				if(a[i]%j==0) {
					System.out.print(j + " ");
				}
		    }
			System.out.println("]\n");
			leia.close();
		}
	}
		
}
