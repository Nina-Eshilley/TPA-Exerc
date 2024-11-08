import java.util.*;
public class CrescDecresc {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[], b[], c[], i, j, k;
		a = new int [10];
		b = new int [10];
		c = new int [10];
		for(i=0; i<10; i++ ) {
			System.out.println("Escreva o "+(i+1)+"º número de A");
			a[i] = leia.nextInt();
			b[i] = a[i];		
			c[i] = a[i];
		}
		//Organizando B em ordem Crescente
		for (i = 0; i < 10 - 1; i++) {
			for (j = 0; j < 9 - i; j++) { 
				if (b[j] > b[j + 1]) { // se esse elemento for maior que o próximo
					k= b[j]; // K vai receber 
					b[j] = b[j + 1]; // e o B[j] recebe o valor maior
					b[j + 1] = k; //e agora o valor maior é o valor original de B[j]
					//fazendo com que fiquem em ordem crescente
				} 
			} 
		 } 
		//Organizando C em ordem Decrescente
		for (i = 0; i < 10 - 1; i++) { 
			for (j = 0; j < 9 - i; j++) {
				if (c[j] < c[j + 1]) { // é o mesmo cálculo que o B, só que para o caso do elemento ser menor que o próximo
					k = c[j];
					c[j] = c[j + 1]; 
					c[j + 1] = k;
				}
			}
		}
		System.out.print("A = [");
		for (i=0; i<10;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]\n");
		System.out.print("B = [");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");
		System.out.print("C = [");
		for (i=0; i<10;i++) {
			System.out.print(c[i]+ " ");	
		}
		System.out.print("]\n");
		leia.close();
		}
	}
