package streamsApi;

import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static UnaryOperator<String> maiscula= n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra= n -> n.charAt(0) + "";
    public final static UnaryOperator<String> grito= n -> n + "!!!";
}
