package array;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos");
        int qtdeAlunos = scan.nextInt();

        System.out.println("Quantas notas por aluno");
        int qtdeNotas = scan.nextInt();

        double [][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = scan.nextDouble();
                total += notasDaTurma[i][j];
            }


        }
        double media = total / (qtdeNotas * qtdeAlunos);
        System.out.println("Media da turma é; " + media);

        scan.close();
    }
}
