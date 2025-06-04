package lista04.questao06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Util {
    public static Deque<Integer> numerosPrimos = new ArrayDeque<>();

    public static void adicionandoPrimos() {
        numerosPrimos.add(2);
        for (int i = 3; i < 100000; i++) {
            Deque<Integer> numerosPrimosAux = numerosPrimos;
            boolean primo = true;
            for(Integer numeroPrimo : numerosPrimosAux){
                if(i % numeroPrimo == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                numerosPrimos.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> fatoracaoPrima = new ArrayDeque<>();
        adicionandoPrimos();
        Deque<Integer> numerosPrimosAux = numerosPrimos;
        System.out.println("Qual número você quer ver a fatoração prima?");
        int num = Integer.parseInt(scanner.nextLine());

        while (num != 1) {
            if (num % numerosPrimosAux.peek() == 0) {
                fatoracaoPrima.add(numerosPrimosAux.peek());
                num /= numerosPrimosAux.peek();
            } else {
                numerosPrimosAux.remove();
            }
        }

        String resultado = "";
        int tamanho = fatoracaoPrima.size();
        for (int i = 0; i < tamanho; i++) {
            resultado += fatoracaoPrima.peek();
            if (i != tamanho - 1) {
                resultado += " X ";
            }
            fatoracaoPrima.remove();
        }
        System.out.println(resultado);
    }
}
