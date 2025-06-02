package lista03.questao02;

import java.util.ArrayList;
import java.util.List;

public class Util {
	public static int getNumeroReverso(int n) {
		int ultimoDigito;
		int nReverso = 0;
		
		while (n != 0) {    
			ultimoDigito = n % 10;
	    	nReverso = nReverso * 10 + ultimoDigito;
		    n = n / 10; 
		}
		
		return nReverso;
	}

	public static void main(String[] args) {
		List<Integer> numeros1 = new ArrayList<Integer>();
		List<Integer> numeros2 = new ArrayList<Integer>();
		int numeroReverso;

		numeros1.add(1234);
		numeros1.add(870);
		numeros1.add(7297);
		numeros1.add(349893);
		numeros1.add(2343);
		numeros1.add(5555555);
		numeros1.add(909);
		numeros1.add(9865);
		numeros1.add(234);
		numeros1.add(11);

		for(int numero : numeros1){
			numeroReverso = getNumeroReverso(numero);
			while(numero < 10){
				numero /= 10;
			}
			while(numeroReverso < 10){

			}
		}
		for (String animal5oumaisletras : numeros2){
			numeros1.remove(animal5oumaisletras);
		}
	}
}
