package lista05.questao05;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File alunos = new File("lista05/textos/alunos.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(alunos));
            String nome;
            double somaMedias = 0;
            int qtd = 0;
            while ((nome = reader.readLine()) != null) {
                System.out.print("Qual a média final de " + nome + "? ");
                somaMedias += Double.parseDouble(scanner.nextLine());
                qtd++;
            }
            System.out.print("Média Final Geral: " + somaMedias/qtd);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
