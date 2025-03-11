package streamsApi;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Allen", 9);
        Aluno a2 = new Aluno("Chelsea Tembe", 20);
        Aluno a3 = new Aluno("blabla", 7);
        Aluno a4 = new Aluno("valter", 17);
        Aluno a5 = new Aluno("Allen", 9);
        Aluno a6 = new Aluno("Chelsea zelia Tembe", 20);
        Aluno a7 = new Aluno("blabla", 7);
        Aluno a8 = new Aluno("bla", 17);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);


        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nStrip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        
        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 9)
                .forEach(System.out::println);
    }
}
