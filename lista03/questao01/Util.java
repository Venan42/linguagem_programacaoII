package lista03.questao01;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void main(String[] args) {
        List<String> animais1 = new ArrayList<String>();
        List<String> animais2 = new ArrayList<String>();

        animais1.add("Cachorro");
        animais1.add("Gato");
        animais1.add("Periquito");
        animais1.add("Besouro");
        animais1.add("Formiga");
        animais1.add("Macaco");
        animais1.add("Girafa");
        animais1.add("Elefante");
        animais1.add("Leão");
        animais1.add("Hiena");

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
