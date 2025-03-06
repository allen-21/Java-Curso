package streamsApi;

import lambdas.Predicado;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args){
        Aluno a1 =  new Aluno("Allen", 9);
        Aluno a2 = new Aluno("Chelsea Tembe", 20);
        Aluno a3 = new Aluno("blabla", 7);
        Aluno a4 = new Aluno("valter", 17);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >=10;
        Function<Aluno,Double >apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a,b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
