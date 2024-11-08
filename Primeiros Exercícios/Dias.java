import java.util.*;
public class Dias {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println ("Digite o número de dias");
		dia = leia.nextInt();
		mes = dia/30;
		ano = dia/365;
		System.out.println ("Os dia convertidos em meses é igual a: " +mes);
		System.out.println ("Os dia convertidos em anos é igual a: "  +ano);
	}leia.close();

}
