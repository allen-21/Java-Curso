package array;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        // primeiro for para receber os dados
        // segundo foreach para calcular a media

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        int a = scan.nextInt();
        double[] notas = new double[a];
        for (int i = 0; i < notas.length ; i++) {

            System.out.print("digite a nota " + (i + 1 ) + ": ");
            notas[i] = scan.nextDouble();

        }
        double total = 0;
        for(double nota : notas){
            total += nota;
        }
        System.out.println("A media é " + (total/ notas.length) );

     scan.close();

    }


}
