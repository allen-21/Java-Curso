package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //.add() lançará uma exceção caso a fila esteja cheia.
        //.offer() retorna falso caso a fila esteja cheia.
        // Diferenca é o comportamento ocorre quando a fila esta cheia
        fila.add("Ana");// retorna false
        fila.offer("Bia");//Lanca uma Excecao
        fila.add("Allen");
        fila.offer("Anibal");
        fila.offer("Valter");

        // Peek e Element -> obter o proximo elemnto da fila(Sem Remover)
        // Diferenca é o comportamento ocorre quando a fila esta cheia vazia
        System.out.println(fila.peek());// retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element());// lanca uma excecao

        // Poll e Remove -> obter o proximo elemnto da fila e Remover
        // Diferenca é o comportamento ocorre quando a fila esta cheia vazia
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //fila.clear();
        //fila.size();
        //fila.isEmpty();
        //fila.contains(...);

    }
}
