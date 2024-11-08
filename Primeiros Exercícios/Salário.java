import java.util.*;
public class Salário {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		double salario, novoSalario;
		int dependentes;
		System.out.println("Digite o valor do seu salário");
		salario= ler.nextDouble();
		System.out.println("Digite a quantidade de dependentes");
		dependentes= ler.nextInt();
		novoSalario= salario+(dependentes*55.00);
		System.out.println ("O novo valor do seu salário é igual a: " +novoSalario);
	}ler.close();
}
