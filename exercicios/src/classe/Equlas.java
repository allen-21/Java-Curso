package classe;

public class Equlas {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Anibal";
        u1.email = "ValterAnibal@gmail.com";
        Usuario u2 = new Usuario();
        u2.nome = "Anibal";
        u2.email = "ValterAnibal@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
