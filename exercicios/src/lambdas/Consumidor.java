package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 15.20,0.2);
        imprimir.accept(p1);

        Produto p3 = new Produto("Caneta", 15.20,0.02);
        Produto p4 = new Produto("Caderno", 15.20,0.02);
        Produto p5 = new Produto("Lapis", 15.20,0.02);

        List<Produto> produtos = Arrays.asList(p1, p3,p4,p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
