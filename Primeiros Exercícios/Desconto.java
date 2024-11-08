import java.util.*;
public class Desconto {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		double preco, precoFinal;
		int desconto;
		System.out.println("Digite o preço do produto:");
		preco= ler.nextDouble();
		System.out.println("Digite a porcentagem do desconto:");
		desconto= ler.nextInt();
		precoFinal= preco- (preco/100)*desconto;
		System.out.println("O novo preço será de: " +precoFinal);	

	}ler.close();

}
