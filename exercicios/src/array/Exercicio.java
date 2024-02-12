package array;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlinoA = new double[3];
        notasAlinoA[0] = 7.3;
        notasAlinoA[1] = 9;
        notasAlinoA[2] = 6.8;


        System.out.println(Arrays.toString(notasAlinoA));
        
        double total = 0;
        for (int i = 0; i < notasAlinoA.length ; i++) {
            total += notasAlinoA[i];
        }
        System.out.println(total / notasAlinoA.length);

        double[] notasAlunoB = {8.2, 4.5 ,4.5, 10};

        for (int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];

        }
        System.out.println(total / notasAlunoB.length);
    }

}
