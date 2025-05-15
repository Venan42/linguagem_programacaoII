package aula10;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static void main(String[] args) {
        //Um mapa é um dicionário, resumidamente.
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("1", 1);
        mapa.put("2", 1);
        mapa.put("3", 1);
        mapa.put("4", 1);

        System.out.println(mapa.toString());

    }
}
