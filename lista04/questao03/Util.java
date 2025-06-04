package lista04.questao03;

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
        while (num > 0) {
            pilhaNumero.push(getUltimoDigito(num));
            num /= 10; //retirando o ultimo digito
        }
        String resposta = "";
        while (!pilhaNumero.isEmpty()) {
            resposta = pilhaNumero.pop() + resposta;
        }
        System.out.print("\nO número invertido é: " + resposta);
    }
}
