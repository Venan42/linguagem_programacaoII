package lista05.questao04;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File nomes = new File("lista05/textos/nomes.txt");
        File sobrenomes = new File("lista05/textos/sobrenomes.txt");
        try {
            Random gerador = new Random();
            System.out.print("Quantas pessoas serão geradas?");
            int quantidade = Integer.parseInt(scanner.nextLine());
            String[] pessoas = new String[quantidade];
            String nome = "", sobrenome = "";
            BufferedWriter pessoasWrite = new BufferedWriter(new FileWriter("lista05/textos/pessoas.txt"));
            for (int i = 0; i < quantidade; i++) {
                BufferedReader nomesRead = new BufferedReader(new FileReader(nomes));
                BufferedReader sobrenomesRead = new BufferedReader(new FileReader(sobrenomes));
                int auxNome = gerador.nextInt(19) + 1;
                String linha = "";
                while (auxNome > 0) {
                    auxNome--;
                    linha = nomesRead.readLine();
                }
                nome = linha;
                int auxSobrenome = gerador.nextInt(19) + 1;
                while (auxSobrenome > 0) {
                    auxSobrenome--;
                    linha = sobrenomesRead.readLine();
                }
                sobrenome = linha;
                String pessoa = nome + " " + sobrenome;
                pessoas[i] = pessoa;
            }
            for (int i = 1; i < pessoas.length; i++) {
                String nomeTemp = pessoas[i]; // enésimo nome
                int j = i - 1; // índice de nome anterior ao enésimo nome em comparação
                /* realocação de nomes anteriores para índices imediatamente subsequentes
                 * até que seja encontrado nome em ordem alfabética anterior ao enésimo nome */
                while (j >= 0 && pessoas[j].compareTo(nomeTemp) > 0) {
                    pessoas[j + 1] = pessoas[j];
                    j--;
                }
                pessoas[j + 1] = nomeTemp;
            }
            for(int i = 0; i < pessoas.length; i++){
                pessoasWrite.write(pessoas[i] + ", idade: " + gerador.nextInt(100) + "\n");
            }

            pessoasWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
