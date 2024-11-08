import java.util.*;
public class Média {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nI, nF, i=0, j=0, k=1;
		double media=0;
		System.out.println("Digite um número inicial");
		nI=leia.nextInt();
		System.out.println("Digite um número final");
		nF=leia.nextInt();
		System.out.println("A média aritmétca do intervalo entre os número "+nI+" e "+nF+" é: ");
		while(nI<nF) {
			j=nI+k;
			k=j; 
			i++; 
			nI++; 
		}leia.close();
		media=j/i;
		System.out.println(media);
	}

}
