package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // imformacoes do funcionario

        // tipos numericos inteiros
        byte anosDeEmoresa = 23;
        short numeroDeVoos = 524;
        int id = 45454;
        long pontosAcumulados=3_234_845_223L;

        // tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status= 'A';

        // Dias de empresa
        System.out.println(anosDeEmoresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
