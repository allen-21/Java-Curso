package streamsApi;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media().adicionar(9.8).adicionar(8.4);
        Media m2 = new Media().adicionar(8.8).adicionar(8.4);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.conbinar(m1, m2).getValor());


    }
}
