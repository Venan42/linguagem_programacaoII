package lista04.questao07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> numeros = new ArrayDeque<>();
        int numero;
        do {
            System.out.print("Qual numero adicionar à pilha? ");
            numero = scanner.nextInt();
            numeros.push(numero);
        } while (numero != 0);
        numeros.pop();
        System.out.print("Ocorroencias do ultimo numero adicionado (" + (numeros.peek()) + "): ");
        numero = numeros.pop();
        int ocorrencias = 1;
        for(Integer numeroAux : numeros){
            if(numero == numeroAux)
                ocorrencias++;
        }
        System.out.println(ocorrencias);
    }
}
