package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args){
        Aluno a1 =  new Aluno("Allen", 9);
        Aluno a2 = new Aluno("Chelsea Tembe", 20);
        Aluno a3 = new Aluno("blabla", 7);
        Aluno a4 = new Aluno("valter", 17);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >=10;
        Function<Aluno,Double > apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia=
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia=
                (m1, m2) -> Media.conbinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A media do aluno e " + media.getValor());

    }
}
