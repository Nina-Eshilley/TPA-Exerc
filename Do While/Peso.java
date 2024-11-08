import java.util.*;
public class Peso {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int a;
			String s, resposta;
			double peso;
			do {
				System.out.println("Escreva sua altura em centímetros");
				a=leia.nextInt();
				System.out.println("Escreva seu sexo: 'F' para feminino, 'M' para masculino");
				s=leia.next();
				if(s.equalsIgnoreCase("f")) {
					peso=52+(0.67*(a-152.4));
					System.out.printf("Seu peso ideal é %.1f" ,peso);
			        }else if (s.equalsIgnoreCase("m")){
					peso=52+(0.75*(a-152.4));
					System.out.printf("Seu peso ideal é %.1f" ,peso);
			        }else {
					System.out.println("Letra inválida");
				}
			System.out.println();
			System.out.println("Deseja continuar? 'S' para sim, 'N' para não");
			resposta=leia.next();
			}while(resposta.equalsIgnoreCase("S"));
			leia.close();	
		
	}
}
