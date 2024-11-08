import java.util.*;
public class Nota {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int mb, b, r, i, totalAlunos, nota;
		double porc;
		System.out.println("Digite a quantidade total de alunos");
		totalAlunos=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou I");
		i=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou R");
		r=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou B");
		b=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou MB");
		mb=leia.nextInt();
		i= i/totalAlunos*100;
		r= r/totalAlunos*100;
		b= b/totalAlunos*100;
		mb= mb/totalAlunos*100;
		System.out.println("As estatíscas dos alunos são:");
		System.out.println("Menção em I: "+ i);
		System.out.println("Menção em R: "+ r);
		System.out.println("Menção em B: "+ b);
		System.out.println("Menção em M: "+ mb);
	}

}
