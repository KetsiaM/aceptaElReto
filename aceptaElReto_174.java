package aceptaElReto;


import java.util.Arrays;
import java.util.Scanner;

public class aceptaElReto_174 {
   
	static boolean buscarRepetidos(String n) {
        for (int i = 0; i < n.length() - 1; i++) {
            for (int j = i + 1; j < n.length(); j++) {
                if (n.charAt(i) == n.charAt(j)) return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int cont = 0;
		int pos = 0;

		System.out.println("Inserta numero de intentos");
		int numIntentos = tec.nextInt();
		int a�o[] = new int[numIntentos];
		
		do {
		System.out.println("Introduce un a�o:");
		a�o[pos] = tec.nextInt();
		pos ++;
		cont ++;
	}while (numIntentos > cont);
		
	
		/**/	
	 for (int i = 0; i < a�o.length; i++) {
		 calcularFechas(a�o[i]); 
	}
	
	
	}
	 public static void calcularFechas(int a�o) {
		 	int temp_a�o;
	        boolean repetido, temp;
	        int left, right;
	        
	        repetido = buscarRepetidos(String.valueOf(a�o));

	            temp = repetido;
	            temp_a�o = a�o;

	            left = 0;
	            while (temp == repetido) {
	                temp = buscarRepetidos(String.valueOf(temp_a�o));
	                if (temp == repetido) {
	                    temp_a�o--;
	                    left++;
	                }
	            }

	            left--;
	            temp_a�o = a�o;
	            temp = repetido;

	            right = 0;
	            while (temp == repetido) {
	                temp = buscarRepetidos(String.valueOf(temp_a�o));
	                if (temp == repetido) {
	                    temp_a�o++;
	                    right++;
	                }
	            }

	            System.out.println((a�o - left) + " " + (left + right));
	        

	    }


	  
	 }
		
		
		
		
		
		
	


