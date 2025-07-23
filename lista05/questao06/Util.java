package lista05.questao06;

import java.io.*;

public class Util {
    public static void main(String[] args) {
        File nomes = new File("lista05/textos/nomes.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomes));
            String nome;
            int qtdPar = 0, qtdImpar = 0;
            while ((nome = reader.readLine()) != null) {
                if(nome.length() % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
            System.out.println("Quantidade de palavras com quantidade par de cacteres: " + qtdPar);
            System.out.println("Quantidade de palavras com quantidade impar de cacteres: " + qtdImpar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
