package excecao.personalizadaB.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("anibal",7);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}
