import java.util.*;
public class Somatório {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10]; // Vetor q vai guardar os somatórios

        // Colocar  os números do vetor A
        System.out.println("Digite 10 números para o vetor A:");
        for (int i= 0; i< 10; i++) { 
            a[i] = leia.nextInt();
        }

        // Calcular o vetor B
        for (int i = 0; i < 10; i++) { // Loop para calcular B
            b[i] = 0; // Inicializa B[i] com 0
            for (int j = i; j < 10; j++) { // Soma de A[i] até A[9]
                b[i] += a[j]; // Adiciona A[j] ao somatório
            }
        }

        // Mostrar os resultados
        System.out.println("Vetor A:");
        for (int i = 0; i < 10; i++) { // Loop para imprimir A
            System.out.print(a[i] + " "); // Imprime o elemento A[i]
        }
        System.out.println(); // Pula uma linha

        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) { // Loop para imprimir B
            System.out.print(b[i] + " "); // Imprime o elemento B[i]
        }
        System.out.println(); // Pula uma linha

        leia.close(); // Fecha o scanner
    }

}
