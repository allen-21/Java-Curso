package oo.composicao.desafio;

public class DesafioTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("pc", 30000);
        Produto p2 = new Produto("monitor", 25000);

        Compra compra1 = new Compra();
        compra1.adcionarItem(p1, 2);
        compra1.adcionarItem(p2,2);
        Compra compra2 = new Compra();
        compra2.adcionarItem(p2, 4);

        Cliente c1 = new Cliente("Allen");
        c1.adcionarCompras(compra1);
        c1.adcionarCompras(compra2);

        System.out.println(c1);




    }
}
