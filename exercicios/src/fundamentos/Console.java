package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade");
        int idade = entrada.nextInt();//lê o "\\\\n" que o teclado.nextInt() deixa para trás
        entrada.nextLine();
        System.out.println("Digite o nome do seu pais");
        String pais = entrada.nextLine();

        System.out.printf("%s tem %d anos %s.", nome, idade, pais);

        entrada.close();
    }
}
