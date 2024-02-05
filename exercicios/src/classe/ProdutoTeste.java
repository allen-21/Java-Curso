package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        p1.nome = "Notebook";
        p1.preco = 4000.25;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.precoComDesconto());

        Produto p2 = new Produto();
        p2.nome ="Pc";
        p2.preco = 4000.25;
        Produto.desconto = 0.30;

        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.precoComDesconto());



    }
}
