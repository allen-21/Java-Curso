package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        //pegar uma letra especifica da frase
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));// ignora as letras mausculas ou menusculas

        var nome = "Anibal";
        var sobrenome = "Muchanga";
        var idade = 33;
        var salario = 12356.555;

        System.out.println("Nome: " + nome + "\nSobrenome: " +
                sobrenome+ "\nIdade: " +idade+
                "\nSalario: " +salario+ "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha %.2f MT.", nome ,
                sobrenome, idade, salario);
        System.out.println("");
        System.out.println("Änibal Muchanga".contains("cha"));
        System.out.println("Änibal Muchanga".indexOf("cha"));
        System.out.println("Änibal Muchanga".substring(7));
        System.out.println("Änibal Muchanga".substring(7, 10));

    }
}
