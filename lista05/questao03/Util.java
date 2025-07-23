package lista05.questao03;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File nomes = new File("lista05/textos/nomes.txt");
        File sobrenomes = new File("lista05/textos/sobrenomes.txt");
        try {
            Random gerador  = new Random();
            System.out.print("Quantas pessoas serão geradas?");
            int quantidade = Integer.parseInt(scanner.nextLine());
            String nome = "", sobrenome = "";
            for(int i = 0; i < quantidade; i++){
                BufferedReader nomesRead = new BufferedReader(new FileReader(nomes));
                BufferedReader sobrenomesRead = new BufferedReader(new FileReader(sobrenomes));
                int auxNome = gerador.nextInt(19) + 1;
                String linha = "";
                while(auxNome > 0) {
                    auxNome--;
                    linha = nomesRead.readLine();
                }
                nome = linha;
                int auxSobrenome = gerador.nextInt(19) + 1;
                while(auxSobrenome > 0){
                    auxSobrenome--;
                    linha = sobrenomesRead.readLine();
                }
                sobrenome = linha;
                System.out.println("Nome: " + nome + " " + sobrenome + ", idade: " + gerador.nextInt(100));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
