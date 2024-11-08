import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a[]= new int[5];
        // Entrar com os números do vetor a
        System.out.println("Digite os 5 números que deseja ver a tabuada:");
        for (int i= 0; i< 5; i++) {
            a[i] = leia.nextInt();
        }
        // Pra mostrar a tabuada de cada número do vetor
        for (int i= 0; i< 5; i++) {
            int numero = a[i];
            System.out.println("A tabuada do número " + numero + " é:");
            // Calcula e mostra a tabuada do número atual
            for (int t = 1; t <= 10; t++) {
                int resultado = numero * t;
                System.out.println(numero + " x " + t + " = " + resultado);
            }
            System.out.println();
        }
        
        leia.close();
    }
}
