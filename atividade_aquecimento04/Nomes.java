package atividade_aquecimento04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        boolean op = true;
        while (op) {
            try {
                System.out.println("Adicionar nome(i) ou sair(e)?");
                String opcao = scanner.nextLine();
                if(opcao.toLowerCase().equals("e"))
                    break;
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);
            } catch (Exception e) {
                System.out.println("Operação inválida");
            }
        }
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.print("Quantidade de nomes que terminam com 'a': ");
        for (String nome : nomes) {
            if(nome.endsWith("a"))
                a++;
        }
        System.out.println(a);
        System.out.print("Quantidade de nomes que terminam com 'e': ");
        for (String nome : nomes) {
            if(nome.endsWith("e"))
                e++;
        }
        System.out.println(e);

        System.out.print("Quantidade de nomes que terminam com 'i': ");
        for (String nome : nomes) {
            if(nome.endsWith("i"))
                i++;
        }
        System.out.println(i);

        System.out.print("Quantidade de nomes que terminam com 'o': ");
        for (String nome : nomes) {
            if(nome.endsWith("o"))
                o++;
        }
        System.out.println(o);

        System.out.print("Quantidade de nomes que terminam com 'u': ");
        for (String nome : nomes) {
            if(nome.endsWith("u"))
                u++;
        }
        System.out.println(u);

        scanner.close();

    }
}
