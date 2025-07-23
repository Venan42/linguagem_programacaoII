package lista05.questao01;

import java.io.*;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o caminho?");
        String caminho = scanner.nextLine();
        File file = new File(caminho);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String linha;
            int soma = 0, contador = 0;
            while((linha = reader.readLine()) != null){
                soma += Integer.parseInt(linha);
                contador++;
            }
            System.out.println(soma / contador);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
