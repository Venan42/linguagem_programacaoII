package lista03.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> animais1 = new ArrayList<String>();
        List<String> animais2 = new ArrayList<String>();

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i+1) + "º animal: ");
            String animal = scanner.nextLine();
            animais1.add(animal);
        }
        for(String animal : animais1){
            if(animal.length()>=5) {
                animais2.add(animal);
            }
        }
        for (String animal5oumaisletras : animais2){
            animais1.remove(animal5oumaisletras);
        }

        System.out.println(animais1);
        System.out.println(animais2);
    }
}
