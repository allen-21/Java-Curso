package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler num1
        //ler num2
        //+ - * / %
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o Segundo numero");
        double num2 = entrada.nextDouble();
        System.out.println("Qual é a operacao que desejas");
        String operacao = entrada.next();

        //Logica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1,operacao,num2,resultado);

        entrada.close();



    }
}
