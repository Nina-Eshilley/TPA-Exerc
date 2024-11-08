import java.util.*;
public class Maisnovo {
	public static void main(String args[]) {
		Scanner leia= new Scanner(System.in);
		int nasc, anoAtual, idade, usuarios=10, idJovem, idVelho=0, i;
		System.out.println("Digite o ano atual");
		anoAtual= leia.nextInt();
		System.out.println();
		System.out.println("Digite o 1º ano de nascimento");
		System.out.println();
		nasc= leia.nextInt();
		idade= anoAtual-nasc;
		idJovem=idVelho;
		for(i=2; i<=usuarios; i++) {
			System.out.println("Escreva o ano de nascimento " +i);
			nasc= leia.nextInt();
			idade=anoAtual-nasc;
			System.out.println("A idade do usuário "+i+ " é: "+idade+" anos");
			System.out.println();
			if(idade>idVelho) {
				idVelho=idade;
			}
			if(idade<idJovem) {
				idJovem=idade;
			}
		}
		System.out.println("O mais novo tem "+idJovem+" anos");
		System.out.println("O mais velho tem "+idVelho+" anos");
		leia.close();
	}

}
