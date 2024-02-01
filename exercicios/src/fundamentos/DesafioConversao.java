package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        //Pegar nos salrios atravez do console
        // nas casas decimais poder aceitar tanto ponto como virgula
        Scanner pegar = new Scanner(System.in);
        String salario1, salario2, salario3;
        System.out.println("Digite o primeiro salario");
        salario1 = pegar.next().replace(',','.');
        System.out.println("Digite o segundo salario");
        salario2 = pegar.next().replace(',','.');
        System.out.println("Digite o terceiro salario");
        salario3 = pegar.next().replace(',','.');

        //converter a vergula por ponto
       // salario1 = salario1.replace(',','.');
      //  salario2 = salario2.replace(',','.');
       // salario3 = salario3.replace(',','.');

        //Converter String para double
        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        // calcular media
        double media = (s1 + s2 + s3) / 3;

        System.out.println("A media do seu salario é" + media);

        pegar.close();

    }
}
