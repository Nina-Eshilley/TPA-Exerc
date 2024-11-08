import java.util.*;
public class Nascimento {
	public static void main (String args[]){
		Scanner ler = new Scanner (System.in);
		int nascimento, atualAno, idade;
		System.out.println ("Digite o ano de nascimento");
		nascimento = ler.nextInt();
		System.out.println ("Digite o ano atual");
		atualAno = ler.nextInt();
		idade = atualAno-nascimento;
		System.out.println ("A sua idade é: " +idade);
		
	}ler.close();

}
