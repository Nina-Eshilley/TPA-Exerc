import java.util.*;
public class Primo {
		public static void main(String[] args) {
			Scanner leia= new Scanner(System.in);
			int i, n=10,  div, num, p;
			int a[] = new int [n];
			for(i=0; i<n; i++) {
				System.out.println("Entre com o "+(i+1)+"º valor de A:");
				a [i] = leia.nextInt();
			}
			System.out.print("A = [");
			for (i=0; i<10; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("]\n");
			System.out.println(" ");
			for (i=0; i<n; i++) {
				num = a[i];
				div = 0;
				for (p =1; p<=num; p++) {
					if (num%p == 0) {
						div++;
					}
				}
				if (div == 2) {
					System.out.println(num+ " é um número primo");
					System.out.println(" ");
				}else {
					System.out.println(num+ " Não é um número primo");
					System.out.println(" ");
					}
				leia.close();
			}
		}

	}

