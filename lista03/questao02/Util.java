package lista03.questao02;

import java.util.ArrayList;
import java.util.List;

public class Util {
	public static void main(String[] args) {
		List<Integer> numeros1 = new ArrayList<Integer>();
		List<Integer> numeros2 = new ArrayList<Integer>();
		int ultimoDitigo, primeiroDigito;

		numeros1.add(1234);
		numeros1.add(870);
		numeros1.add(7297);
		numeros1.add(349893);
		numeros1.add(2343);
		numeros1.add(5555555);
		numeros1.add(9090);
		numeros1.add(909);
		numeros1.add(234);
		numeros1.add(11);

		for(Integer numero : numeros1){
			ultimoDitigo = numero % 10;
			primeiroDigito = numero;
			while(primeiroDigito > 10){
				primeiroDigito /= 10;
			}
			if(ultimoDitigo == primeiroDigito)
				numeros2.add(numero);
		}
		for (Integer numero : numeros2){
			numeros1.remove(numero);
		}

		System.out.println("Numeros que não tem o primeiro e ultimo dígitos iguais: " + numeros1);
		System.out.println("Numeros que tem o primeiro e utlimo dígitos iguais: " + numeros2);
	}
}
