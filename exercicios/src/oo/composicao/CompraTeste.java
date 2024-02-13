package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente= "Joao";
        c1.adcionarItem(new Item("Pc", 20,30000));
        c1.adcionarItem(new Item("Laptop", 2,3000));

        System.out.println(c1.itens.size());
        System.out.println(c1.valorTotal());

        //SO pra mostrar a relacap bidirecional
        double total = c1.itens.get(0).compra.itens.get(1).compra.valorTotal();
        System.out.println("O total é " + total);

    }
}
