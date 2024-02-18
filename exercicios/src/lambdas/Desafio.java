package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
        * 1. a partir do produto calcular o preco real (Com desconto
        * 2. imposto municipal: >= 2500 (8.5%)&& < 2500(inseto)
        * 3. frete;  >=3000 (100)&& <3000 (50)
        * 4. arredondar: deixar duas casas decimais
        * 5. formatar : r$1200.52
        * */

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> imposto =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> (preco + "MT").replace(".",",");

        Produto p = new Produto("Redmi 10", 12000.04,0.12);
        String preco = precoFinal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preco final é " + preco);



    }
}
