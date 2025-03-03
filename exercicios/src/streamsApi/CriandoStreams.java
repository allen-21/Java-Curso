package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
        langs.forEach(print);
        String[] maisLangs= {"Pyton","C#","Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("C","PHP", "Dart\n");
        outrasLangs.stream().forEach(print);
        //Stream de forma aleatoria
        outrasLangs.parallelStream().forEach(print);

        //Stream de forma infinita
    //    Stream.generate(() -> "a").forEach(print);
     //    Stream.iterate(0,n -> n + 1).forEach(println);

    }
}
