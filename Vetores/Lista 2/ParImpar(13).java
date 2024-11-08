import java.util.*;
public class ParImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[], b[], i;
		a = new int [10];
		b = new int [10];
		for(i=0; i<10; i++) {
			System.out.println("Escreva o "+(i+1)+"º valor de A");
			a[i] = leia.nextInt();
			if(a[i]%2==0) {
				b[i]=1;
			}else {
				b[i]=0;
			}
		}
		System.out.print("A= [");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]\n");
		System.out.print("B= [");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]\n");
		leia.close();
	}

}
