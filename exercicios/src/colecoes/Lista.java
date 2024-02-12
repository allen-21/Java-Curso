package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("bla12");
        lista.add(u1);
        lista.add(new Usuario("Anibal"));
        lista.add(new Usuario("Valter"));
        lista.add(new Usuario("Banana"));

        System.out.println(lista.get(2));

        System.out.println(">>>"+ lista.remove(1));
        System.out.println(lista.remove(new Usuario("Banana")));

        System.out.println("Tem? " + lista.contains(new Usuario("Anibal")));

        for (Usuario u: lista){
            System.out.println(u.toString());
        }
    }
}
