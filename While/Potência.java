import java.util.*;
public class Potência {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int i=0, e, b, p=1;
		System.out.println("Escreva uma número para a base da potência");
		b=leia.nextInt();
		System.out.println("Agora escreva um número para ser o expoente");
		e=leia.nextInt();
		while(i<e){
			p=p*b;
			i++;
		}leia.close();
		System.out.println("O resultado é: "+p);
	}

}
