package fundamentos.operadores;

public class DesafioLogico {
    public static void main(String[] args) {
        //Trabalho na terca(V ou F)
        // Trabalho na quinta(V ou F)
        // si os foi derem V iremos comprar uma tv de 50p
        // si apenas uma der V iremos comprar uma de 32p e tomar sorvete
        // Caso nao tenha saido de casa

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudadevl = !comprouSorvete;//Operador Unario

        System.out.println("Comprou TV 50p\"? " + comprouTv50);
        System.out.println("Comprou TV 32p\"? " + comprouTv32);
        System.out.println("Comprou TV 32\"Sorvete?" + comprouSorvete);


        System.out.println("Mais saudavel" + maisSaudadevl);

    }
}
