package lista04.questao04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Util {
    public static int getUltimoDigito(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> pilhaNumero = new ArrayDeque<>();
        System.out.print("Qual número você quer inverter? ");
        int num = scanner.nextInt();
        int numAux = num;
        while (numAux > 0) {
            pilhaNumero.push(getUltimoDigito(numAux));
            numAux /= 10; //retirando o ultimo digito
        }
        String resposta = "";
        while (!pilhaNumero.isEmpty()) {
            resposta = pilhaNumero.pop() + resposta;
        }
        System.out.println("O número invertido é: " + resposta);
        if(Integer.parseInt(resposta) == num)
            System.out.println("O número é um palíndromo.");
        else
            System.out.println("O número não é um palíndromo.");
    }
}
