import java.util.*;
public class MaiorMenor {
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroUsuarios = 5, i = 0, anoAtual, anoNascimento,idade;
        System.out.print("Digite o ano atual: ");
        anoAtual = leia.nextInt();
        while (i <= numeroUsuarios) { //enquanto i for menor ou igual ao número de usuários,
        	i++; // vai adicionar +1
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = leia.nextInt();
            idade = anoAtual - anoNascimento;
            System.out.println( idade + " anos");
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você menor de idade.");
            }
            System.out.println();
        }

        leia.close();
    }

}
