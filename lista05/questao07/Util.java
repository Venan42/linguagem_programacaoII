package lista05.questao07;

import java.io.*;

public class Util {
    public static void main(String[] args) {
        File nomes = new File("lista05/textos/nomes.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomes));
            String nome;
            int qtdWordEndsWithVowel = 0;
            while((nome = reader.readLine()) != null) {
                if(nome.endsWith("a") ||
                nome.endsWith("e") ||
                nome.endsWith("i") ||
                nome.endsWith("o") ||
                nome.endsWith("u")) { qtdWordEndsWithVowel++;}
            }
            System.out.println("Quantidade de palavras que terminam com uma vogal: " + qtdWordEndsWithVowel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
