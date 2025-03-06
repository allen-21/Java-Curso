package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Match {

        public static void main(String[] args){
            Aluno a1 =  new Aluno("Allen", 9);
            Aluno a2 = new Aluno("Chelsea Tembe", 20);
            Aluno a3 = new Aluno("blabla", 7);
            Aluno a4 = new Aluno("valter", 17);

            List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

            Predicate<Aluno> aprovado = a -> a.nota >=10;
            Predicate<Aluno> reprovado = aprovado.negate();

            System.out.println(alunos.stream().allMatch(aprovado));
            System.out.println(alunos.stream().anyMatch(aprovado));
            System.err.println(alunos.stream().noneMatch(reprovado));

        }

}
