package excecao;

public class ChegadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        gerarErro2();

        System.out.println("Fim :");
    }
// excecao Nao checada ou nao verificada
    static void gerarErro1() {
      throw new RuntimeException("Ocorreu um erro #1");

    }
// excecao checada ou verificada
    static void gerarErro2() {
        try {
            throw new Exception("Ocorreu um erro #2");
        } catch (Exception e) {
            System.out.println("que bom");
        }

    }
}
