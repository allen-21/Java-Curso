package excecao;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            imprimirNomeDoAluno(a1);
        }catch (Exception e){
            System.out.println("ocorreu um erro no monento de imprimir o nome do usuario");
        }
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("nunca chegara aqui" + e.getMessage());
        }
        System.out.println("FIm: ");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);

    }
}
