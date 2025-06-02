package lista03.questao04;

import java.text.CollationElementIterator;
import java.util.*;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> animais1 = new ArrayList<>();
        Collection<String> animais2 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            boolean animaisEstaNaLista = false;
            System.out.print("Digite o " + (i+1) + "º animal: ");
            String animal = scanner.nextLine();
            for(String animalNaLista : animais1){
                if(animal.equalsIgnoreCase(animalNaLista)){
                    animaisEstaNaLista = true;
                    break;
                }
            }
            if(animaisEstaNaLista){
                i--;
                System.out.println("O animal já está na lista!");
                continue;
            }
            animais1.add(animal);
        }
        Iterator<String> iterator = animais1.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.length() >= 5) {
                animais2.add(animal);
                iterator.remove();
            }
        }

        System.out.println(animais1);
        System.out.println(animais2);
    }
}
