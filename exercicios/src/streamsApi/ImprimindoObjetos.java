package streamsApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("bla", "Allen", "Anibal");
        System.out.println("Usando Array");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
