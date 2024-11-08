import java.util.*;
public class Primo {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int n, i=1, j=0, resto;
		System.out.println("Digite um número e descubra se ele é primo ou não!");
		n=leia.nextInt();
		while(i<=n) {
			resto= n%i;
			if(resto==0){
				j=j+1;	
			}
			i++;
		}
		if(j==2) {
			System.out.println("O número "+n+" é primo");
		}else {
			System.out.println("O número "+n+" não é primo");
		}leia.close();
	}

}
