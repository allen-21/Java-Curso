package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Allen"));
        usuarios.add(new Usuario("Anibal"));
        usuarios.add(new Usuario("Valter"));

        System.out.println(usuarios.contains(new Usuario("Allen")));
    }
}
