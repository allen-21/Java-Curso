package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> ususrio = new HashMap<>();
        ususrio.put(1, "Allen");
        ususrio.put(2, "Anibal");
        ususrio.put(3, "Valter");

        System.out.println(ususrio.size());
        System.out.println(ususrio.isEmpty());
        System.out.println(ususrio.keySet());
        System.out.println(ususrio.values());
        System.out.println(ususrio.entrySet());

        System.out.println(ususrio.containsKey(1));
        System.out.println(ususrio.containsValue("Allen"));

        System.out.println(ususrio.get(2));
        System.out.println( ususrio.remove(3));

        for(int chave: ususrio.keySet()){
            System.out.println(chave);
        }

        for(String valor: ususrio.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: ususrio.entrySet()){
            System.out.println(registro.getKey() + " >>>");
            System.out.println(registro.getValue());
        }
    }
}
