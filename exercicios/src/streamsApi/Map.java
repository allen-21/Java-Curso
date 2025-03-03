package streamsApi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static streamsApi.Utilitarios.*;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(String::toUpperCase).forEach(print);



      System.out.println(maiscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("\n\nUsando composicao...");
        marcas.stream()
                .map(maiscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);


    }
}
