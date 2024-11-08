import java.util.*;
public class Metro {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int metro, km;
		System.out.println("Digite a quantidade de metros:");
		metro= ler.nextInt();
		km= metro/1000;
		System.out.println("A quantidade de metros convertidos em quilômetros é igual a: " +km);
	}ler.close();

}
