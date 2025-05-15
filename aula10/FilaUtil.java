package aula10;

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaUtil {
    public static void main(String[] args) {
        Queue<Integer> fila = new ArrayDeque<>(2);
        fila.offer(5);
        fila.offer(7);
        fila.offer(9);
        fila.offer(9);
        fila.offer(9);
        fila.poll();
        System.out.println(fila.toString());

    }
}
