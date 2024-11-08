import java.util.*;
public class Alunos {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int menino, menina, total, pcMenina, pcMenino;
		System.out.println("Digite a quantidade de meninos: ");
		menino= leia.nextInt();
		System.out.println("Digite a quantidade de meninas: ");
		menina= leia.nextInt();
		total= menina+menino;
		pcMenino=(menino*100)/total;
		pcMenina= (menina*100)/total;
		System.out.println("A porcentagem de meninos é: " +pcMenino);
		System.out.println("A porcentagem de meninas é: " +pcMenina);
	}leia.close();

}
