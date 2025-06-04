package lista04.questao01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> animais1 = new HashSet<>();
        Set<String> animais2 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º animal: ");
            String animal = scanner.nextLine();

            boolean animaisEstaNaLista = false;
            for(String animalNaLista : animais1){
                if (animal.equalsIgnoreCase(animalNaLista)) {
                    animaisEstaNaLista = true;
                    break;
                }
            }
            if(animaisEstaNaLista){
                i--;
                System.out.println("O animal já está na lista!");
                continue;
            }
            Animais animal1 = new Animais(animal);
            animais1.add(animal);
        }
        for (String animal : animais1) {
            if (animal.length() >= 5)
                animais2.add(animal);
        }
        for (String animal : animais2) {
            animais1.remove(animal);
        }

        System.out.println(animais1);
        System.out.println(animais2);
    }
}
