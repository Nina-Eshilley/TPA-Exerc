import java.util.*;
public class Ipva {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		double veiculo, ipva;
		System.out.println("Digite o valor do veículo:");
		veiculo= leia.nextDouble();
		ipva= veiculo/100*4;
		System.out.println("O valor do IPVA é de: " +ipva);
	}leia.close();

}
