package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Allen");
        Aluno aluno2 = new Aluno("Anibal");
        Aluno aluno3 = new Aluno("Valter");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("C#");
        Curso curso3 = new Curso("mySql");

        curso1.adcionarAluno(aluno1);
        curso1.adcionarAluno(aluno2);

        curso2.adcionarAluno(aluno2);
        curso2.adcionarAluno(aluno3);

        curso3.adcionarAluno(aluno3);
        curso3.adcionarAluno(aluno1);

        aluno1.adcionarCurso(curso3);
        aluno1.adcionarCurso(curso2);

        for (Aluno aluno: curso2.alunos){
            System.out.println("Estou matriculado no curso " + curso2.nome + "....");
            System.out.println("...e o meu nome é " + aluno.nome);
            System.out.println();
        }

        Curso cursoEncontrado = aluno1.obterCursoPornome("C#");
        if(cursoEncontrado !=null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }


}
