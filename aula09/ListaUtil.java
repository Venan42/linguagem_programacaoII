package aula09;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaUtil {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(0, "Maria");
        nomes.add(0, "Alex");
        nomes.add(1, "João");
        nomes.add(2, "Sofia");
        System.out.println(nomes.toString());
        LinkedList<String> nomesLinked = new LinkedList<>();
        nomesLinked.add(0, "maria");
        System.out.println(nomesLinked.toString());

    }
}
