import java.util.*;
public class ImparPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a[], b[], i, par=0, impar=19; 
		a = new int [20];
		b = new int [20];
		for(i=0; i<20; i++) {
			System.out.println("Escreva o valor do " +(i+1)+ "° elemento de A");
			a[i]=leia.nextInt();
			System.out.println();
			if(a[i]%2==0) {
				b[par]=a[i];
				par++;
			}else {
				b[impar]=a[i];
				impar--;
			}
		}
		System.out.print("A= [");
		for(i=0; i<20; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println("]\n");
		System.out.println();
		System.out.print("'A' separada por pares e ímpares, respectivamente: [");
		for(i=0; i<20; i++){
			System.out.print(b[i]+ " ");
		}
		System.out.println("]\n");
		leia.close();
	}
}
