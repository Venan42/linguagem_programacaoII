package lista04.questao05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LivroUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Livro> livros = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Qual o nome do título do " + (i + 1) + " livro que você quer adicionar?");
            String titulo = scanner.nextLine();

            System.out.print("Qual o nome do autor do " + (i + 1) + " livro que você quer adicionar?");
            String autor = scanner.nextLine();

            System.out.print("Qual a edição do " + (i + 1) + " livro que você quer adicionar?");
            int edicao = Integer.parseInt(scanner.nextLine());

            System.out.print("Qual o ano de lançamento do " + (i + 1) + " livro que você quer adicionar?");
            int ano = Integer.parseInt(scanner.nextLine());

            livros.add(new Livro(titulo, autor, edicao, ano));
        }
        System.out.println("Livros: ");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("removendo penultimo livro...");
        Livro livroAux = livros.pop();
        livros.pop();
        livros.add(livroAux);
        System.out.println("Livros atualizados: ");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
