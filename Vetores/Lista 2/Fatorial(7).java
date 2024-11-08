import java.util.*;
public class Fatorial {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[], b[], f=1, i, j=0;
		a = new int [15];
		b = new int [15];
		for(i=0; i<15; i++){
			System.out.println("Escreva o valor do " +(i+1)+ "° elemento de A");
			a[i]=leia.nextInt();
			System.out.println();
			}
		//calculando fatorial
		for(i=0; i<15; i++) {
			f=1;
			for(j=1; j<=a[i]; j++ ) {
				f=f*j;
			}
			b[i]=f;
		}
		System.out.print("A= [");
		for(i=0; i<15; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]\n");
		System.out.println(" ");
		System.out.print("Fatorial de cada valor de 'A'= [");
		for(i=0; i<15; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]\n");
		leia.close();
	}

}
