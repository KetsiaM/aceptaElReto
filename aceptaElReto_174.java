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
		int año[] = new int[numIntentos];
		
		do {
		System.out.println("Introduce un año:");
		año[pos] = tec.nextInt();
		pos ++;
		cont ++;
	}while (numIntentos > cont);
		
	
		/**/	
	 for (int i = 0; i < año.length; i++) {
		 calcularFechas(año[i]); 
	}
	
	
	}
	 public static void calcularFechas(int año) {
		 	int temp_año;
	        boolean repetido, temp;
	        int left, right;
	        
	        repetido = buscarRepetidos(String.valueOf(año));

	            temp = repetido;
	            temp_año = año;

	            left = 0;
	            while (temp == repetido) {
	                temp = buscarRepetidos(String.valueOf(temp_año));
	                if (temp == repetido) {
	                    temp_año--;
	                    left++;
	                }
	            }

	            left--;
	            temp_año = año;
	            temp = repetido;

	            right = 0;
	            while (temp == repetido) {
	                temp = buscarRepetidos(String.valueOf(temp_año));
	                if (temp == repetido) {
	                    temp_año++;
	                    right++;
	                }
	            }

	            System.out.println((año - left) + " " + (left + right));
	        

	    }


	  
	 }
		
		
		
		
		
		
	


