
public class Tabuada {
	public static void main(String[] args) {
		int n=1, r, i;
		System.out.println("Tabuada do "+n+":");
		while(n<10) {
			i=1;
			while (i <11) {
				r=i*n;
				System.out.println(n+" x "+i+" = "+r);
				i++;
			}
			System.out.println( );
			System.out.println("Tabuada do "+(n+1)+":");
			i=1;
			n++;
			while(i<11) {
				r=i*n;
				System.out.println(n+" x "+i+" = "+r);
				i++;
			}
		}
	}

}
