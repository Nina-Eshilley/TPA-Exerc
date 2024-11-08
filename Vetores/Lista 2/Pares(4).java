import java.util.*;
public class Pares {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a[]= new int [10];
		 // Entrar com os números do vetor a
        System.out.println("Digite os 10 números para ver os números pares:");
        for (int i= 0; i< 10; i++) {
            a[i] = leia.nextInt();
        }
        
        // Pra mostrar cada número do vetor
        for (int i= 0; i< 10; i++) {
            int numero = a[i];
            System.out.println();
            System.out.println("Os pares de 0 até " + numero + " são:");
            // Calcula e mostra os pares do número atual
            for (int t = 0; t <= numero; t += 2) {
            	System.out.println(t);
            }
        }
        
        leia.close();
	}

}
