import java.util.*;
public class FaixaEtária {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int i=1,  usuarios=15, idade1, idade, idVelho=0, idJovem=0;
		double g1=0, g2=0, g3=0, g4=0, g5=0;
		System.out.println("Escreva a idade do usuário " +i);
		System.out.println();
		idade1=leia.nextInt();
		idJovem=idade1;
		idVelho=idade1;
		if (idade1<=15) {
			System.out.println("Você é do 1° grupo");
			g1=g1+1;
			System.out.println();
		}else if (idade1<=30) {
			System.out.println("Você é do 2° grupo");
			g2=g2+1;
			System.out.println();
		}else if (idade1<=45) {
			System.out.println("Você é do 3° grupo");
			g3=g3+1;
			System.out.println();
		}else if (idade1<=60) {
			System.out.println("Você é do 4° grupo");
			g4=g4+1;
			System.out.println();
		}else {
			System.out.println("Você é do 5° grupo");
			g5=g5+1;
			System.out.println();
		}
		while (i<usuarios) {
			i++;
			System.out.println("Escreva a idade do usuário " +i);
			idade=leia.nextInt();
			// descobrindo os grupos
			if (idade<=15) {
				System.out.println("Você é do 1° grupo");
				g1=g1+1;
				System.out.println();
			}else if (idade<=30) {
				System.out.println("Você é do 2° grupo");
				g2=g2+1;
				System.out.println();
			}else if (idade<=45) {
				System.out.println("Você é do 3° grupo");
				g3=g3+1;
				System.out.println();
			}else if (idade<=60) {
				System.out.println("Você é do 4° grupo");
				g4=g4+1;
				System.out.println();
			}else {
				System.out.println("Você é do 5° grupo");
				g5=g5+1;
				System.out.println();
			}
			// armazenando qual é mais velho e qual é mais novo
			if (idade>idVelho) { 
				idVelho=idade; 
			}
			if(idade<idJovem) { 
			   idJovem=idade;
			}
		}leia.close();
		
			//cálculo de porcentagens 
		g1= (g1*100)/usuarios;
		System.out.println("A porcentagem de pessoas da 1ª faixa etária é: " +g1+ "%");
		System.out.println();
		g2= (g2*100)/usuarios;
		System.out.println("A porcentagem de pessoas da 2ª faixa etária é: " +g2+"%");
		System.out.println();
		g3= (g3*100)/usuarios;
		System.out.println("A porcentagem de pessoas da 3ª faixa etária é: " +g3+"%");
		System.out.println();
		g4= (g4*100)/usuarios;
		System.out.println("A porcentagem de pessoas da 4ª faixa etária é: " +g4+"%");
		System.out.println();
		g5= (g5*100)/usuarios;
		System.out.println("A porcentagem de pessoas da 5ª faixa etária é: " +g5+"%");
		System.out.println();
		
		System.out.println("O mais velho tem " +idVelho+" anos, e o mais novo tem "+idJovem+" anos");
			
		}

}
