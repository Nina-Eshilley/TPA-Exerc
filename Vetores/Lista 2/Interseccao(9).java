import java.util.*;
public class Interseccao {
	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
	    int a[], b[], c[], i, j, k=0, l, inter;
	    a=new int[10];
	    b=new int[10];
	    c=new int[10];   
	    
	    for (i=0 ; i<10 ; i++) {
	    	System.out.println("Digite o " +(i+1)+ "° número de A");
	    	a[i]=leia.nextInt();
	    }
	    for (i=0 ; i<10 ; i++) {
	    	System.out.println("Digite o " +(i+1)+ "° número de B");
	    	b[i]=leia.nextInt();
	    	}
	    
	  //calculando intersecão 
	    for (i=0 ; i<10 ; i++) {
	    	for(j=0; j<10; j++) { 
	    		if(a[i] == b[j]) { 
	    			inter=0; 
	    			//vendo se o número se repete em C 
	    			for(l=0; l<k; l++) { 
	    				if(c[l] == a[i]) {
	    					inter = 1; 
	    					} 
	    				} 
	    			//se não se repetir, C[k] pode receber A
	    			if (inter == 0) {
	    				c[k]=a[i]; 
	    				k++; 
	    				}
	    		}
	    	}	
	    }
	    	
		System.out.print("A = [");
		for (i=0; i<10;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]\n");
		
		System.out.print("B = [");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");
		
		System.out.print("C = [");
		for (i=0; i<k;i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]\n");
		leia.close();
		}
	}
