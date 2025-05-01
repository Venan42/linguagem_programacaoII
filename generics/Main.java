package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FilaGenerica<Integer> f = new FilaGenerica<>(10);
        try {
            for(int i = 0; i < 10; i++){
                f.adicionar(i);
            }
            System.out.println("Lista: " + f.imprimir());
            System.out.println("Itens removidos: ");
            System.out.println(Arrays.toString(f.removerVarios(3)));
            System.out.println("Nova lista: " + f.imprimir());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
