package lista05.questao02;

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
            System.out.println("Quantos numeros fazer a média?");
            int resp = Integer.parseInt(scanner.nextLine());
            String linha;
            int soma = 0;
            for(int i = 0; i < resp; i++) {
                if((linha = reader.readLine()) == null) {
                    System.out.println("Quantidade de numeros excedida.");
                    throw new IOException();
                }
                soma += Integer.parseInt(linha);
            }
            System.out.println(soma / resp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
